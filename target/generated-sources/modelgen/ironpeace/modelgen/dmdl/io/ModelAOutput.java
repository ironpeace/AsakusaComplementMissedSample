package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.ModelA;
import java.io.IOException;
/**
 * <code>model_a</code>をTSVなどのレコード形式で出力する。
 */
public final class ModelAOutput implements ModelOutput<ModelA> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public ModelAOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(ModelA model) throws IOException {
        emitter.emit(model.getKeycodeOption());
        emitter.emit(model.getFieldA1Option());
        emitter.emit(model.getFieldA2Option());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}