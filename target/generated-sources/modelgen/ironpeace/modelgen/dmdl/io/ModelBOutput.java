package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.ModelB;
import java.io.IOException;
/**
 * <code>model_b</code>をTSVなどのレコード形式で出力する。
 */
public final class ModelBOutput implements ModelOutput<ModelB> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public ModelBOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(ModelB model) throws IOException {
        emitter.emit(model.getKeycodeOption());
        emitter.emit(model.getFieldB1Option());
        emitter.emit(model.getFieldB2Option());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}