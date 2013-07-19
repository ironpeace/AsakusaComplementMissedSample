package ironpeace.jobflow;

import ironpeace.jobflow.io.JoinedModelToCsv;
import ironpeace.jobflow.io.ModelAFromCsv;
import ironpeace.jobflow.io.ModelBFromCsv;
import ironpeace.modelgen.dmdl.model.JoinedModel;
import ironpeace.modelgen.dmdl.model.ModelA;
import ironpeace.modelgen.dmdl.model.ModelB;
import ironpeace.operator.CmsOperatorFactory;
import ironpeace.operator.CmsOperatorFactory.BranchWithJoin;
import ironpeace.operator.CmsOperatorFactory.Joined;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Project;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Restructure;

@JobFlow(name="CmsJobFlow")
public class CmsJobFlow extends FlowDescription {

	final In<ModelA> modelA;
	final In<ModelB> modelB;
	final Out<JoinedModel> joined;
	
	final CoreOperatorFactory cp = new CoreOperatorFactory();
	
	public CmsJobFlow(
				@Import(name="modelA", description=ModelAFromCsv.class)
				In<ModelA> modelA,
				@Import(name="modelB", description=ModelBFromCsv.class)
				In<ModelB> modelB,
				@Export(name="joined", description=JoinedModelToCsv.class)
				Out<JoinedModel> joined
			){
		this.modelA = modelA;
		this.modelB = modelB;
		this.joined = joined;
	}
	
	@Override
	protected void describe() {
		CmsOperatorFactory op = new CmsOperatorFactory();
		
		Joined preJoined = op.joined(modelA, modelB);
		
		Project<JoinedModel> projected = cp.project(preJoined.joined, JoinedModel.class);

		this.joined.add(projected.out);
		
		Restructure<JoinedModel> restructedA = cp.restructure(preJoined.missed, JoinedModel.class);
		
		this.joined.add(restructedA.out);
		
		BranchWithJoin branched = op.branchWithJoin(modelB, modelA);
		
		cp.stop(branched.other);
		
		Restructure<JoinedModel> restructedB = cp.restructure(branched.bmissed, JoinedModel.class);
		
		this.joined.add(restructedB.out);
	}

}
