package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.ResultOutput;
import ironpeace.modelgen.dmdl.model.ModelA;
import org.apache.hadoop.mapreduce.TaskInputOutputContext;
/**
 * {@code modelA->CmsOperator.branchWithJoin(operator#1855107489)}へのシャッフル処理を担当するプログラムの断片。
 */
@SuppressWarnings("deprecation") public final class CombineOutputFragment4 implements Result<ModelA> {
    private final TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector;
    private final ShuffleKey key = new ShuffleKey();
    private final ShuffleValue value = new ShuffleValue();
    /**
     * インスタンスを生成する。
     * @param collector 実際の出力先
     */
    public CombineOutputFragment4(TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector) {
        this.collector = collector;
    }
    @Override public void add(ModelA result) {
        this.key.setPort4(result);
        this.value.setPort4(result);
        ResultOutput.write(this.collector, this.key, this.value);
    }
}