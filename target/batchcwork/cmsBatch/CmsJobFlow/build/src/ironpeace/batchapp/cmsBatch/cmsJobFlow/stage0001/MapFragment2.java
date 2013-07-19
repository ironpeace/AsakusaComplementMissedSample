package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.ModelA;
/**
 * {@code [in->padding(pseud#769732461)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment2 implements Result<ModelA> {
    private final Result<ModelA> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment2(Result<ModelA> out) {
        this.out = out;
    }
    @Override public void add(ModelA result) {
        this.out.add(result);
    }
}