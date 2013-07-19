package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.ResultOutput;
import ironpeace.modelgen.dmdl.model.ModelB;
import org.apache.hadoop.mapreduce.TaskInputOutputContext;
/**
 * {@code modelB->CmsOperator.joined(operator#1913537093)}へのシャッフル処理を担当するプログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapOutputFragment2 implements Result<ModelB> {
    private final TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector;
    private final ShuffleKey key = new ShuffleKey();
    private final ShuffleValue value = new ShuffleValue();
    /**
     * インスタンスを生成する。
     * @param collector 実際の出力先
     */
    public MapOutputFragment2(TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector) {
        this.collector = collector;
    }
    @Override public void add(ModelB result) {
        this.key.setPort2(result);
        this.value.setPort2(result);
        ResultOutput.write(this.collector, this.key, this.value);
    }
}