package ironpeace.batch;

import ironpeace.jobflow.CmsJobFlow;

import com.asakusafw.vocabulary.batch.Batch;
import com.asakusafw.vocabulary.batch.BatchDescription;

@Batch(name="cmsBatch")
public class CmsBatch extends BatchDescription {

	@Override
	public void describe(){
		run(CmsJobFlow.class).soon();
	}
}
