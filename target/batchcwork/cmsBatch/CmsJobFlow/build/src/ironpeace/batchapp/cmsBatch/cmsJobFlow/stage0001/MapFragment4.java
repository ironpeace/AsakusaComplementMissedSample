package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.JoinedModel;
import ironpeace.modelgen.dmdl.model.PreJoinedModel;
/**
 * {@code [in->project(operator#2032298615)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment4 implements Result<PreJoinedModel> {
    private final Result<JoinedModel> out;
    private JoinedModel cache = new JoinedModel();
    /**
     * インスタンスを生成する。
     * @param out {@code project#out}への出力
     */
    public MapFragment4(Result<JoinedModel> out) {
        this.out = out;
    }
    @Override public void add(PreJoinedModel result) {
        this.cache.reset();
        this.cache.setFieldB2Option(result.getFieldB2Option());
        this.cache.setFieldA1Option(result.getFieldA1Option());
        this.cache.setFieldB1Option(result.getFieldB1Option());
        this.cache.setFieldA2Option(result.getFieldA2Option());
        this.cache.setKeycodeOption(result.getKeycodeOption());
        this.out.add(this.cache);
    }
}