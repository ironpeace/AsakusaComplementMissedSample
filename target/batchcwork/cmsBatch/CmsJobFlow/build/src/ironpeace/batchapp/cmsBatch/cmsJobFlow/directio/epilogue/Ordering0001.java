package ironpeace.batchapp.cmsBatch.cmsJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.DirectOutputOrder;
import ironpeace.modelgen.dmdl.model.JoinedModel;
/**
 * An ordering output "joined" class for "directio".
 */
public final class Ordering0001 extends DirectOutputOrder {
    /**
     * Creates a new instance.
     */
    public Ordering0001() {
        super();
    }
    @Override public void set(Object rawObject) {
        JoinedModel object = (JoinedModel) rawObject;
    }
}