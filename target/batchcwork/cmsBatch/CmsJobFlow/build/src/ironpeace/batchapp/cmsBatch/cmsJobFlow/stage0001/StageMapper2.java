package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import ironpeace.modelgen.dmdl.model.ModelA;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;
/**
 * {@code 
         * [in->padding(pseud#1811560891){owner=FlowBlock&#64;1603313878}, in->padding(pseud#769732461){owner=FlowBlock&#64;1603313878}]
         * }の処理を担当するマッププログラム。
 */
@SuppressWarnings("deprecation") public final class StageMapper2 extends Mapper<NullWritable, ModelA, ShuffleKey, 
        ShuffleValue> {
    private ModelA cache = new ModelA();
    private RuntimeResourceManager runtimeResourceManager;
    private MapFragment2 line0;
    private MapFragment3 line;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        final MapOutputFragment1 shuffle = new MapOutputFragment1(context);
        final MapOutputFragment4 shuffle2 = new MapOutputFragment4(context);
        this.line = new MapFragment3(shuffle2);
        this.line0 = new MapFragment2(shuffle);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.line0 = null;
        this.line = null;
    }
    @Override public void run(Context context) throws IOException, InterruptedException {
        this.setup(context);
        while(context.nextKeyValue()) {
            cache.copyFrom(context.getCurrentValue());
            this.line.add(cache);
            cache.copyFrom(context.getCurrentValue());
            this.line0.add(cache);
        }
        this.cleanup(context);
    }
}