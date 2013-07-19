package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.flow.SegmentedWritable;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.model.ModelA;
import ironpeace.modelgen.dmdl.model.ModelB;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
/**
 * ステージ#1シャッフルで利用するKeyクラス。
 */
@SuppressWarnings("deprecation") public final class ShuffleKey implements SegmentedWritable {
    /**
     * シャッフルフェーズを通した演算子のポート番号。
     */
    public int portId = -1;
    @Override public int getSegmentId() {
        return this.portId;
    }
    /**
     * CmsOperator.joined#modelAが利用するキー (keycode)
     */
    public StringOption groupElem0Term1 = new StringOption();
    /**
     * CmsOperator.branchWithJoin#modelBが利用するキー (keycode)
     */
    public StringOption groupElem1Term1 = new StringOption();
    /**
     * CmsOperator.joined#modelAのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort1(ModelA source) {
        this.portId = 1;
        this.groupElem0Term1.copyFrom(source.getKeycodeOption());
    }
    /**
     * CmsOperator.joined#modelBのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort2(ModelB source) {
        this.portId = 2;
        this.groupElem0Term1.copyFrom(source.getKeycodeOption());
    }
    /**
     * CmsOperator.branchWithJoin#modelBのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort3(ModelB source) {
        this.portId = 3;
        this.groupElem1Term1.copyFrom(source.getKeycodeOption());
    }
    /**
     * CmsOperator.branchWithJoin#modelAのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort4(ModelA source) {
        this.portId = 4;
        this.groupElem1Term1.copyFrom(source.getKeycodeOption());
    }
    /**
     * 指定のキーのグループ情報をこのオブジェクトに複製する
     * @param original コピーするキー
     */
    public void copyGroupFrom(ShuffleKey original) {
        this.portId = original.portId;
        if(this.portId < 0) {
            return;
        }
        switch(this.portId) {
            case 1:
            case 2:
                this.groupElem0Term1.copyFrom(original.groupElem0Term1);
                break;
            case 3:
            case 4:
                this.groupElem1Term1.copyFrom(original.groupElem1Term1);
                break;
            default:
                throw new AssertionError(this.portId = original.portId);
        }
    }
    @Override public void write(DataOutput out) throws IOException {
        switch(this.portId) {
            case 1:
                out.writeInt(1);
                this.groupElem0Term1.write(out);
                break;
            case 2:
                out.writeInt(2);
                this.groupElem0Term1.write(out);
                break;
            case 3:
                out.writeInt(3);
                this.groupElem1Term1.write(out);
                break;
            case 4:
                out.writeInt(4);
                this.groupElem1Term1.write(out);
                break;
            default:
                throw new AssertionError(this.portId);
        }
    }
    @Override public void readFields(DataInput in) throws IOException {
        this.portId = in.readInt();
        switch(this.portId) {
            case 1:
                this.groupElem0Term1.readFields(in);
                break;
            case 2:
                this.groupElem0Term1.readFields(in);
                break;
            case 3:
                this.groupElem1Term1.readFields(in);
                break;
            case 4:
                this.groupElem1Term1.readFields(in);
                break;
            default:
                throw new AssertionError(this.portId);
        }
    }
}