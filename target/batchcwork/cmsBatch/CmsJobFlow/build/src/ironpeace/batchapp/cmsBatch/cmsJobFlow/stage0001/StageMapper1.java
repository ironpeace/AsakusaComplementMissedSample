package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import ironpeace.modelgen.dmdl.model.ModelB;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;
/**
 * {@code [in->padding(pseud#1384077551){owner=FlowBlock&#64;1603313878}]}の処理を担当するマッププログラム。
 */
@SuppressWarnings("deprecation") public final class StageMapper1 extends Mapper<NullWritable, ModelB, ShuffleKey, 
        ShuffleValue> {
    private ModelB cache = new ModelB();
    private RuntimeResourceManager runtimeResourceManager;
    private MapFragment1 line;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        final MapOutputFragment3 shuffle1 = new MapOutputFragment3(context);
        final MapOutputFragment2 shuffle0 = new MapOutputFragment2(context);
        this.line = new MapFragment1(new Result<ModelB>() {
            private ModelB cache0 = new ModelB();
            @Override public void add(ironpeace.modelgen.dmdl.model.ModelB arg) {
                cache0.copyFrom(arg);
                shuffle1.add(cache0);
                shuffle0.add(arg);
            }
        })
        ;
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.line = null;
    }
    @Override public void run(Context context) throws IOException, InterruptedException {
        this.setup(context);
        while(context.nextKeyValue()) {
            cache.copyFrom(context.getCurrentValue());
            this.line.add(cache);
        }
        this.cleanup(context);
    }
}