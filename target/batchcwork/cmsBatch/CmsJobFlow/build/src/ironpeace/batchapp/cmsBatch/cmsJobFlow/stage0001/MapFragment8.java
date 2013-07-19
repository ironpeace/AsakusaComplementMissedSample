package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.JoinedModel;
import ironpeace.modelgen.dmdl.model.ModelA;
/**
 * {@code [in->restructure(operator#1915339268)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment8 implements Result<ModelA> {
    private final Result<JoinedModel> out;
    private JoinedModel cache = new JoinedModel();
    /**
     * インスタンスを生成する。
     * @param out {@code restructure#out}への出力
     */
    public MapFragment8(Result<JoinedModel> out) {
        this.out = out;
    }
    @Override public void add(ModelA result) {
        this.cache.reset();
        this.cache.setFieldA1Option(result.getFieldA1Option());
        this.cache.setFieldA2Option(result.getFieldA2Option());
        this.cache.setKeycodeOption(result.getKeycodeOption());
        this.out.add(this.cache);
    }
}