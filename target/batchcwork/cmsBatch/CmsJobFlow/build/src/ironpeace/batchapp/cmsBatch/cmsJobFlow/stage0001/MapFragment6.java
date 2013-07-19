package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.JoinedModel;
import ironpeace.modelgen.dmdl.model.ModelB;
/**
 * {@code [in->restructure(operator#1884617201)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment6 implements Result<ModelB> {
    private final Result<JoinedModel> out;
    private JoinedModel cache = new JoinedModel();
    /**
     * インスタンスを生成する。
     * @param out {@code restructure#out}への出力
     */
    public MapFragment6(Result<JoinedModel> out) {
        this.out = out;
    }
    @Override public void add(ModelB result) {
        this.cache.reset();
        this.cache.setFieldB2Option(result.getFieldB2Option());
        this.cache.setFieldB1Option(result.getFieldB1Option());
        this.cache.setKeycodeOption(result.getKeycodeOption());
        this.out.add(this.cache);
    }
}