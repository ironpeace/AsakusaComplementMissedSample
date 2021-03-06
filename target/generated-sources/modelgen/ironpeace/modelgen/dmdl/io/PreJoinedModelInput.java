package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.RecordParser;
import ironpeace.modelgen.dmdl.model.PreJoinedModel;
import java.io.IOException;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>pre_joined_model</code>を読み出す
 */
public final class PreJoinedModelInput implements ModelInput<PreJoinedModel> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public PreJoinedModelInput(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(PreJoinedModel model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getKeycodeOption());
        parser.fill(model.getFieldA1Option());
        parser.fill(model.getFieldA2Option());
        parser.fill(model.getFieldB1Option());
        parser.fill(model.getFieldB2Option());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}