package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.ModelAInput;
import ironpeace.modelgen.dmdl.io.ModelAOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * modelAを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ModelAInput.class)@ModelOutputLocation(ModelAOutput.class)@PropertyOrder({
            "keycode", "field_a_1", "field_a_2"}) public class ModelA implements DataModel<ModelA>, Writable {
    private final StringOption keycode = new StringOption();
    private final StringOption fieldA1 = new StringOption();
    private final StringOption fieldA2 = new StringOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.keycode.setNull();
        this.fieldA1.setNull();
        this.fieldA2.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(ModelA other) {
        this.keycode.copyFrom(other.keycode);
        this.fieldA1.copyFrom(other.fieldA1);
        this.fieldA2.copyFrom(other.fieldA2);
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
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=model_a");
        result.append(", keycode=");
        result.append(this.keycode);
        result.append(", fieldA1=");
        result.append(this.fieldA1);
        result.append(", fieldA2=");
        result.append(this.fieldA2);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + keycode.hashCode();
        result = prime * result + fieldA1.hashCode();
        result = prime * result + fieldA2.hashCode();
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
        ModelA other = (ModelA) obj;
        if(this.keycode.equals(other.keycode) == false) {
            return false;
        }
        if(this.fieldA1.equals(other.fieldA1) == false) {
            return false;
        }
        if(this.fieldA2.equals(other.fieldA2) == false) {
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
    @Override public void write(DataOutput out) throws IOException {
        keycode.write(out);
        fieldA1.write(out);
        fieldA2.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        keycode.readFields(in);
        fieldA1.readFields(in);
        fieldA2.readFields(in);
    }
}