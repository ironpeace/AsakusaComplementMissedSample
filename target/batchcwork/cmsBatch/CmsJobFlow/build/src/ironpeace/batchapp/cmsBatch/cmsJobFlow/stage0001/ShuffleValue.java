package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.flow.SegmentedWritable;
import ironpeace.modelgen.dmdl.model.ModelA;
import ironpeace.modelgen.dmdl.model.ModelB;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
/**
 * ステージ#1シャッフルで利用する値クラス。
 */
@SuppressWarnings("deprecation") public final class ShuffleValue implements SegmentedWritable {
    /**
     * セグメント番号。
     */
    public int segmentId = -1;
    @Override public int getSegmentId() {
        return this.segmentId;
    }
    /**
     * CmsOperator.joined#modelAが利用するモデル (1)。
     */
    public ModelA port0001 = new ModelA();
    /**
     * CmsOperator.joined#modelBが利用するモデル (2)。
     */
    public ModelB port0002 = new ModelB();
    /**
     * CmsOperator.branchWithJoin#modelBが利用するモデル (3)。
     */
    public ModelB port0003 = new ModelB();
    /**
     * CmsOperator.branchWithJoin#modelAが利用するモデル (4)。
     */
    public ModelA port0004 = new ModelA();
    /**
     * CmsOperator.joined#modelAのモデルオブジェクトを返す。
     */
    public ModelA getPort1() {
        if(this.segmentId != 1) throw new AssertionError();
        return this.port0001;
    }
    /**
     * CmsOperator.joined#modelAで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort1(ModelA model) {
        this.segmentId = 1;
        this.port0001.copyFrom(model);
    }
    /**
     * CmsOperator.joined#modelBのモデルオブジェクトを返す。
     */
    public ModelB getPort2() {
        if(this.segmentId != 2) throw new AssertionError();
        return this.port0002;
    }
    /**
     * CmsOperator.joined#modelBで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort2(ModelB model) {
        this.segmentId = 2;
        this.port0002.copyFrom(model);
    }
    /**
     * CmsOperator.branchWithJoin#modelBのモデルオブジェクトを返す。
     */
    public ModelB getPort3() {
        if(this.segmentId != 3) throw new AssertionError();
        return this.port0003;
    }
    /**
     * CmsOperator.branchWithJoin#modelBで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort3(ModelB model) {
        this.segmentId = 3;
        this.port0003.copyFrom(model);
    }
    /**
     * CmsOperator.branchWithJoin#modelAのモデルオブジェクトを返す。
     */
    public ModelA getPort4() {
        if(this.segmentId != 4) throw new AssertionError();
        return this.port0004;
    }
    /**
     * CmsOperator.branchWithJoin#modelAで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort4(ModelA model) {
        this.segmentId = 4;
        this.port0004.copyFrom(model);
    }
    @Override public void write(DataOutput out) throws IOException {
        switch(this.segmentId) {
            case 1:
                out.writeInt(1);
                this.port0001.write(out);
                break;
            case 2:
                out.writeInt(2);
                this.port0002.write(out);
                break;
            case 3:
                out.writeInt(3);
                this.port0003.write(out);
                break;
            case 4:
                out.writeInt(4);
                this.port0004.write(out);
                break;
            default:
                throw new AssertionError(this.segmentId);
        }
    }
    @Override public void readFields(DataInput in) throws IOException {
        this.segmentId = in.readInt();
        switch(this.segmentId) {
            case 1:
                this.port0001.readFields(in);
                break;
            case 2:
                this.port0002.readFields(in);
                break;
            case 3:
                this.port0003.readFields(in);
                break;
            case 4:
                this.port0004.readFields(in);
                break;
            default:
                throw new AssertionError(this.segmentId);
        }
    }
}