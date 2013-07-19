package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.JoinedModelInput;
import ironpeace.modelgen.dmdl.io.JoinedModelOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * joined_modelを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(JoinedModelInput.class)@ModelOutputLocation(JoinedModelOutput.class)@
        PropertyOrder({"keycode", "field_a_1", "field_a_2", "field_b_1", "field_b_2"}) public class JoinedModel 
        implements DataModel<JoinedModel>, Writable {
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
    @Override@SuppressWarnings("deprecation") public void copyFrom(JoinedModel other) {
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
     * FIELDA1を返す。
     * @return FIELDA1
     * @throws NullPointerException FIELDA1の値が<code>null</code>である場合
     */
    public Text getFieldA1() {
        return this.fieldA1.get();
    }
    /**
     * FIELDA1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldA1(Text value) {
        this.fieldA1.modify(value);
    }
    /**
     * <code>null</code>を許すFIELDA1を返す。
     * @return FIELDA1
     */
    public StringOption getFieldA1Option() {
        return this.fieldA1;
    }
    /**
     * FIELDA1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldA1Option(StringOption option) {
        this.fieldA1.copyFrom(option);
    }
    /**
     * FIELDA2を返す。
     * @return FIELDA2
     * @throws NullPointerException FIELDA2の値が<code>null</code>である場合
     */
    public Text getFieldA2() {
        return this.fieldA2.get();
    }
    /**
     * FIELDA2を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldA2(Text value) {
        this.fieldA2.modify(value);
    }
    /**
     * <code>null</code>を許すFIELDA2を返す。
     * @return FIELDA2
     */
    public StringOption getFieldA2Option() {
        return this.fieldA2;
    }
    /**
     * FIELDA2を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldA2Option(StringOption option) {
        this.fieldA2.copyFrom(option);
    }
    /**
     * FIELDB1を返す。
     * @return FIELDB1
     * @throws NullPointerException FIELDB1の値が<code>null</code>である場合
     */
    public Text getFieldB1() {
        return this.fieldB1.get();
    }
    /**
     * FIELDB1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldB1(Text value) {
        this.fieldB1.modify(value);
    }
    /**
     * <code>null</code>を許すFIELDB1を返す。
     * @return FIELDB1
     */
    public StringOption getFieldB1Option() {
        return this.fieldB1;
    }
    /**
     * FIELDB1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldB1Option(StringOption option) {
        this.fieldB1.copyFrom(option);
    }
    /**
     * FIELDB2を返す。
     * @return FIELDB2
     * @throws NullPointerException FIELDB2の値が<code>null</code>である場合
     */
    public Text getFieldB2() {
        return this.fieldB2.get();
    }
    /**
     * FIELDB2を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldB2(Text value) {
        this.fieldB2.modify(value);
    }
    /**
     * <code>null</code>を許すFIELDB2を返す。
     * @return FIELDB2
     */
    public StringOption getFieldB2Option() {
        return this.fieldB2;
    }
    /**
     * FIELDB2を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldB2Option(StringOption option) {
        this.fieldB2.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=joined_model");
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
        JoinedModel other = (JoinedModel) obj;
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
     * FIELDA1を返す。
     * @return FIELDA1
     * @throws NullPointerException FIELDA1の値が<code>null</code>である場合
     */
    public String getFieldA1AsString() {
        return this.fieldA1.getAsString();
    }
    /**
     * FIELDA1を設定する。
     * @param fieldA10 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldA1AsString(String fieldA10) {
        this.fieldA1.modify(fieldA10);
    }
    /**
     * FIELDA2を返す。
     * @return FIELDA2
     * @throws NullPointerException FIELDA2の値が<code>null</code>である場合
     */
    public String getFieldA2AsString() {
        return this.fieldA2.getAsString();
    }
    /**
     * FIELDA2を設定する。
     * @param fieldA20 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldA2AsString(String fieldA20) {
        this.fieldA2.modify(fieldA20);
    }
    /**
     * FIELDB1を返す。
     * @return FIELDB1
     * @throws NullPointerException FIELDB1の値が<code>null</code>である場合
     */
    public String getFieldB1AsString() {
        return this.fieldB1.getAsString();
    }
    /**
     * FIELDB1を設定する。
     * @param fieldB10 設定する値
     */
    @SuppressWarnings("deprecation") public void setFieldB1AsString(String fieldB10) {
        this.fieldB1.modify(fieldB10);
    }
    /**
     * FIELDB2を返す。
     * @return FIELDB2
     * @throws NullPointerException FIELDB2の値が<code>null</code>である場合
     */
    public String getFieldB2AsString() {
        return this.fieldB2.getAsString();
    }
    /**
     * FIELDB2を設定する。
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