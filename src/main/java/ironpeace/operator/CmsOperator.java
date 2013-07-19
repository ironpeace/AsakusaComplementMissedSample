package ironpeace.operator;

import ironpeace.modelgen.dmdl.model.ModelA;
import ironpeace.modelgen.dmdl.model.ModelB;
import ironpeace.modelgen.dmdl.model.PreJoinedModel;

import com.asakusafw.vocabulary.model.Key;
import com.asakusafw.vocabulary.operator.MasterBranch;
import com.asakusafw.vocabulary.operator.MasterJoin;

public abstract class CmsOperator {
	
	@MasterJoin
	public abstract PreJoinedModel joined(ModelA modelA, ModelB modelB);
	
	public enum Status { Bmissed, Other }
	
	@MasterBranch
	public Status branchWithJoin(
			@Key(group="keycode") ModelB modelB,
			@Key(group="keycode") ModelA modelA
			){
		if(modelB == null){
			System.out.println("model B missed **************************");
			return Status.Bmissed;
		}else{
			System.out.println("other **************************");
			return Status.Other;
		}
	}
}
