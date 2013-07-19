package ironpeace.batchapp.cmsBatch.cmsJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputKey;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.JoinedModelCsvFormat;
import ironpeace.modelgen.dmdl.model.JoinedModel;
/**
 */
public final class ShuffleKey extends AbstractDirectOutputKey {
    /**
     * Creates a new instance.
     */
    public ShuffleKey() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(JoinedModel.class, "cms/output/", JoinedModelCsvFormat.class, 
                    Naming0001.class, Ordering0001.class)});
    }
}