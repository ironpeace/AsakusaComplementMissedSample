package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.ModelA;
import ironpeace.modelgen.dmdl.model.ModelB;
import ironpeace.operator.CmsOperator;
import ironpeace.operator.CmsOperatorImpl;
/**
 * {@code 
         * [modelB->CmsOperator.branchWithJoin(operator#1855107489), modelA->CmsOperator.branchWithJoin(operator#1855107489)]
         * }の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class ReduceFragment7 extends com.asakusafw.runtime.flow.Rendezvous<
        ShuffleValue> {
    private final Result<ModelA> bmissed;
    private final Result<ModelA> other;
    private boolean sawMaster;
    private ModelB cache = new ModelB();
    private CmsOperatorImpl op = new CmsOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param bmissed {@code CmsOperator.branchWithJoin#bmissed}への出力
     * @param other {@code CmsOperator.branchWithJoin#other}への出力
     */
    public ReduceFragment7(Result<ModelA> bmissed, Result<ModelA> other) {
        this.bmissed = bmissed;
        this.other = other;
    }
    @Override public void process(ShuffleValue value) {
        switch(value.getSegmentId()) {
            case 3:
                this.process0003(value.getPort3());
                break;
            case 4:
                this.process0004(value.getPort4());
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
    private void process0003(ModelB value) {
        if(this.sawMaster == false) {
            this.cache.copyFrom(value);
            this.sawMaster = true;
        }
    }
    private void process0004(ModelA value) {
        CmsOperator.Status branch = this.op.branchWithJoin(this.sawMaster ? this.cache : null, value);
        switch(branch) {
            case Bmissed:
                this.bmissed.add(value);
                break;
            case Other:
                this.other.add(value);
                break;
            default:
                throw new AssertionError(branch);
        }
    }
}