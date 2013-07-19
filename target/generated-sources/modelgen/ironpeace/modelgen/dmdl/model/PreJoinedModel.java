package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.StringOption;
import com.asakusafw.vocabulary.model.Joined;
import com.asakusafw.vocabulary.model.Key;
import ironpeace.modelgen.dmdl.io.PreJoinedModelInput;
import ironpeace.modelgen.dmdl.io.PreJoinedModelOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * pre_joined_modelを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@Joined(terms = {@Joined.Term(source = ModelA.class, mappings = {@Joined.Mapping(source = 
                "keycode", destination = "keycode"),@Joined.Mapping(source = "fieldA1", destination = "fieldA1"),@Joined
                .Mapping(source = "fieldA2", destination = "fieldA2")}, shuffle = @Key(group = {"keycode"})),@Joined.
            Term(source = ModelB.class, mappings = {@Joined.Mapping(source = "keycode", destination = "keycode"),@Joined
                .Mapping(source = "fieldB1", destination = "fieldB1"),@Joined.Mapping(source = "fieldB2", destination = 
                "fieldB2")}, shuffle = @Key(group = {"keycode"}))})@ModelInputLocation(PreJoinedModelInput.class)@
        ModelOutputLocation(PreJoinedModelOutput.class)@PropertyOrder({"keycode", "field_a_1", "field_a_2", "field_b_1", 
            "field_b_2"}) public class PreJoinedModel implements DataModel<PreJoinedModel>, Writable {
    private final StringOption keycode = new StringOption();
    private final StringOption fieldA1 = new StringOption();
    private final StringOption fieldA2 = new StringOption();
    private final StringOption fieldB1 = new StringOption();
    private final StringOption fieldB2 = new StringOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.keycode.setNull();
        this.fieldA1.setNull();
        this.fieldA2.setNull();
        this.fieldB1.setNull();
        this.fieldB2.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(PreJoinedModel other) {
        this.keycode.copyFrom(other.keycode);
        this.fieldA1.copyFrom(other.fieldA1);
        this.fieldA2.copyFrom(other.fieldA2);
        this.fieldB1.copyFrom(other.fieldB1);
        this.fieldB2.copyFrom(other.fieldB2);
    }
    /**
     * keycodeを返す。
     * @return keycode
     * @throws NullPointerException keycodeの値が<code>null</code>である場合
     */
    public Text getKeycode() {
        return this.keycode.get();
    }
    /**
     * keycodeを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setKeycode(Text value) {
        this.keycode.modify(value);
    }
    /**
     * <code>null</code>を許すkeycodeを返す。
     * @return keycode
     */
    public StringOption getKeycodeOption() {
        return this.keycode;
    }
    /**
     * keycodeを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setKeycodeOption(StringOption option) {
        this.keycode.copyFrom(option);
    }
    /**
     * field_a_1を返す。
     * @return field_a_1
     * @throws NullPointerException field_a_1の値が<code>null</code>である場合
     */
    public Text getFieldA1() {
        return this.fieldA1.get();
    }
    /**
     * field_a_1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldA1(Text value) {
        this.fieldA1.modify(value);
    }
    /**
     * <code>null</code>を許すfield_a_1を返す。
     * @return field_a_1
     */
    public StringOption getFieldA1Option() {
        return this.fieldA1;
    }
    /**
     * field_a_1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldA1Option(StringOption option) {
        this.fieldA1.copyFrom(option);
    }
    /**
     * field_a_2を返す。
     * @return field_a_2
     * @throws NullPointerException field_a_2の値が<code>null</code>である場合
     */
    public Text getFieldA2() {
        return this.fieldA2.get();
    }
    /**
     * field_a_2を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldA2(Text value) {
        this.fieldA2.modify(value);
    }
    /**
     * <code>null</code>を許すfield_a_2を返す。
     * @return field_a_2
     */
    public StringOption getFieldA2Option() {
        return this.fieldA2;
    }
    /**
     * field_a_2を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldA2Option(StringOption option) {
        this.fieldA2.copyFrom(option);
    }
    /**
     * field_b_1を返す。
     * @return field_b_1
     * @throws NullPointerException field_b_1の値が<code>null</code>である場合
     */
    public Text getFieldB1() {
        return this.fieldB1.get();
    }
    /**
     * field_b_1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldB1(Text value) {
        this.fieldB1.modify(value);
    }
    /**
     * <code>null</code>を許すfield_b_1を返す。
     * @return field_b_1
     */
    public StringOption getFieldB1Option() {
        return this.fieldB1;
    }
    /**
     * field_b_1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldB1Option(StringOption option) {
        this.fieldB1.copyFrom(option);
    }
    /**
     * field_b_2を返す。
     * @return field_b_2
     * @throws NullPointerException field_b_2の値が<code>null</code>である場合
     */
    public Text getFieldB2() {
        return this.fieldB2.get();
    }
    /**
     * field_b_2を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldB2(Text value) {
        this.fieldB2.modify(value);
    }
    /**
     * <code>null</code>を許すfield_b_2を返す。
     * @return field_b_2
     */
    public StringOption getFieldB2Option() {
        return this.fieldB2;
    }
    /**
     * field_b_2を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldB2Option(StringOption option) {
        this.fieldB2.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=pre_joined_model");
        result.append(", keycode=");
        result.append(this.keycode);
        result.append(", fieldA1=");
        result.append(this.fieldA1);
        result.append(", fieldA2=");
        result.append(this.fieldA2);
        result.append(", fieldB1=");
        result.append(this.fieldB1);
        result.append(", fieldB2=");
        result.append(this.fieldB2);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + keycode.hashCode();
        result = prime * result + fieldA1.hashCode();
        result = prime * result + fieldA2.hashCode();
        result = prime * result + fieldB1.hashCode();
        result = prime * result + fieldB2.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        PreJoinedModel other = (PreJoinedModel) obj;
        if(this.keycode.equals(other.keycode) == false) {
            return false;
        }
        if(this.fieldA1.equals(other.fieldA1) == false) {
            return false;
        }
        if(this.fieldA2.equals(other.fieldA2) == false) {
            return false;
        }
        if(this.fieldB1.equals(other.fieldB1) == false) {
            return false;
        }
        if(this.fieldB2.equals(other.fieldB2) == false) {
            return false;
        }
        return true;
    }
    /**
     * keycodeを返す。
     * @return keycode
     * @throws NullPointerException keycodeの値が<code>null</code>である場合
     */
    public String getKeycodeAsString() {
        return this.keycode.getAsString();
    }
    /**
     * keycodeを設定する。
     * @param keycode0 設定する値
     */
    @SuppressWarnings("deprecation") public void setKeycodeAsString(String keycode0) {
        this.keycode.modify(keycode0);
    }
    /**
     * field_a_1を返す。
     * @return field_a_1
     * @throws NullPointerException field_a_1の値が<code>null</code>である場合
     */
    public String getFieldA1AsString() {
        return this.fieldA1.getAsString();
    }
    /**
     * field_a_1を設定する。
     * @param fieldA10 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldA1AsString(String fieldA10) {
        this.fieldA1.modify(fieldA10);
    }
    /**
     * field_a_2を返す。
     * @return field_a_2
     * @throws NullPointerException field_a_2の値が<code>null</code>である場合
     */
    public String getFieldA2AsString() {
        return this.fieldA2.getAsString();
    }
    /**
     * field_a_2を設定する。
     * @param fieldA20 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldA2AsString(String fieldA20) {
        this.fieldA2.modify(fieldA20);
    }
    /**
     * field_b_1を返す。
     * @return field_b_1
     * @throws NullPointerException field_b_1の値が<code>null</code>である場合
     */
    public String getFieldB1AsString() {
        return this.fieldB1.getAsString();
    }
    /**
     * field_b_1を設定する。
     * @param fieldB10 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldB1AsString(String fieldB10) {
        this.fieldB1.modify(fieldB10);
    }
    /**
     * field_b_2を返す。
     * @return field_b_2
     * @throws NullPointerException field_b_2の値が<code>null</code>である場合
     */
    public String getFieldB2AsString() {
        return this.fieldB2.getAsString();
    }
    /**
     * field_b_2を設定する。
     * @param fieldB20 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldB2AsString(String fieldB20) {
        this.fieldB2.modify(fieldB20);
    }
    @Override public void write(DataOutput out) throws IOException {
        keycode.write(out);
        fieldA1.write(out);
        fieldA2.write(out);
        fieldB1.write(out);
        fieldB2.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        keycode.readFields(in);
        fieldA1.readFields(in);
        fieldA2.readFields(in);
        fieldB1.readFields(in);
        fieldB2.readFields(in);
    }
}