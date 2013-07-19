package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.ModelBInput;
import ironpeace.modelgen.dmdl.io.ModelBOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * modelBを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ModelBInput.class)@ModelOutputLocation(ModelBOutput.class)@PropertyOrder({
            "keycode", "field_b_1", "field_b_2"}) public class ModelB implements DataModel<ModelB>, Writable {
    private final StringOption keycode = new StringOption();
    private final StringOption fieldB1 = new StringOption();
    private final StringOption fieldB2 = new StringOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.keycode.setNull();
        this.fieldB1.setNull();
        this.fieldB2.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(ModelB other) {
        this.keycode.copyFrom(other.keycode);
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
        result.append("class=model_b");
        result.append(", keycode=");
        result.append(this.keycode);
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
        ModelB other = (ModelB) obj;
        if(this.keycode.equals(other.keycode) == false) {
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
        fieldB1.write(out);
        fieldB2.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        keycode.readFields(in);
        fieldB1.readFields(in);
        fieldB2.readFields(in);
    }
}