package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.ModelA;
/**
 * {@code [in->padding(pseud#1811560891)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment3 implements Result<ModelA> {
    private final Result<ModelA> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment3(Result<ModelA> out) {
        this.out = out;
    }
    @Override public void add(ModelA result) {
        this.out.add(result);
    }
}