package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.JoinedModel;
import java.io.IOException;
/**
 * <code>joined_model</code>をTSVなどのレコード形式で出力する。
 */
public final class JoinedModelOutput implements ModelOutput<JoinedModel> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public JoinedModelOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(JoinedModel model) throws IOException {
        emitter.emit(model.getKeycodeOption());
        emitter.emit(model.getFieldA1Option());
        emitter.emit(model.getFieldA2Option());
        emitter.emit(model.getFieldB1Option());
        emitter.emit(model.getFieldB2Option());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}