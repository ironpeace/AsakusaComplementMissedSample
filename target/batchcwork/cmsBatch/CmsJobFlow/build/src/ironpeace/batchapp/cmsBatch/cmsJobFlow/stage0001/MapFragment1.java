package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.ModelB;
/**
 * {@code [in->padding(pseud#1384077551)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<ModelB> {
    private final Result<ModelB> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment1(Result<ModelB> out) {
        this.out = out;
    }
    @Override public void add(ModelB result) {
        this.out.add(result);
    }
}