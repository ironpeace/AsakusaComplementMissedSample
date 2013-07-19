package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.ModelA;
import ironpeace.modelgen.dmdl.model.ModelB;
import ironpeace.modelgen.dmdl.model.PreJoinedModel;
/**
 * {@code [modelA->CmsOperator.joined(operator#1913537093), modelB->CmsOperator.joined(operator#1913537093)]}
         * の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class ReduceFragment5 extends com.asakusafw.runtime.flow.Rendezvous<
        ShuffleValue> {
    private final Result<PreJoinedModel> joined;
    private final Result<ModelB> missed;
    private boolean sawMaster;
    private ModelA cache = new ModelA();
    private PreJoinedModel cache0 = new PreJoinedModel();
    /**
     * インスタンスを生成する。
     * @param joined {@code CmsOperator.joined#joined}への出力
     * @param missed {@code CmsOperator.joined#missed}への出力
     */
    public ReduceFragment5(Result<PreJoinedModel> joined, Result<ModelB> missed) {
        this.joined = joined;
        this.missed = missed;
    }
    @Override public void process(ShuffleValue value) {
        switch(value.getSegmentId()) {
            case 1:
                this.process0001(value.getPort1());
                break;
            case 2:
                this.process0002(value.getPort2());
                break;
            default:
                throw new AssertionError(value);
        }
    }
    @Override public void begin() {
        this.sawMaster = false;
    }
    @Override public void end() {
    }
    private void process0001(ModelA value) {
        if(this.sawMaster == false) {
            this.cache.copyFrom(value);
            this.sawMaster = true;
        }
    }
    private void process0002(ModelB value) {
        if(this.sawMaster) {
            this.cache0.reset();
            this.cache0.setKeycodeOption(this.cache.getKeycodeOption());
            this.cache0.setFieldA1Option(this.cache.getFieldA1Option());
            this.cache0.setFieldA2Option(this.cache.getFieldA2Option());
            this.cache0.setFieldB1Option(value.getFieldB1Option());
            this.cache0.setFieldB2Option(value.getFieldB2Option());
            this.joined.add(this.cache0);
        }
        else {
            this.missed.add(value);
        }
    }
}