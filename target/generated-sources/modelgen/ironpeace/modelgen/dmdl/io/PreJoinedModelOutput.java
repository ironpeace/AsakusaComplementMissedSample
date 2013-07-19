package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.PreJoinedModel;
import java.io.IOException;
/**
 * <code>pre_joined_model</code>をTSVなどのレコード形式で出力する。
 */
public final class PreJoinedModelOutput implements ModelOutput<PreJoinedModel> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public PreJoinedModelOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(PreJoinedModel model) throws IOException {
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