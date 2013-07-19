package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.Rendezvous;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import com.asakusafw.runtime.flow.SegmentedReducer;
import com.asakusafw.runtime.flow.VoidResult;
import com.asakusafw.runtime.stage.output.StageOutputDriver;
import ironpeace.modelgen.dmdl.model.JoinedModel;
import ironpeace.modelgen.dmdl.model.ModelA;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
/**
 * ステージ1の処理を担当するレデュースプログラム。
 */
@SuppressWarnings("deprecation") public final class StageReducer extends SegmentedReducer<ShuffleKey, ShuffleValue, 
        NullWritable, NullWritable> {
    private RuntimeResourceManager runtimeResourceManager;
    private StageOutputDriver outputs;
    private ReduceFragment5 rendezvous;
    private ReduceFragment7 rendezvous0;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        this.outputs = new StageOutputDriver(context);
        final Result<JoinedModel> output = outputs.getResultSink("result0");
        final MapFragment8 line1 = new MapFragment8(output);
        this.rendezvous0 = new ReduceFragment7(line1, new VoidResult<ModelA>());
        final MapFragment6 line = new MapFragment6(output);
        final MapFragment4 line0 = new MapFragment4(output);
        this.rendezvous = new ReduceFragment5(line0, line);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.outputs.close();
        this.outputs = null;
        this.rendezvous = null;
        this.rendezvous0 = null;
    }
    @Override protected Rendezvous<ShuffleValue> getRendezvous(ShuffleKey nextKey) {
        switch(nextKey.getSegmentId()) {
            case 1:
            case 2:
                return this.rendezvous;
            case 3:
            case 4:
                return this.rendezvous0;
            default:
                throw new AssertionError();
        }
    }
}