package ironpeace.batchapp.cmsBatch.cmsJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import ironpeace.modelgen.dmdl.model.JoinedModel;
/**
 * A naming output "joined" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0001 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0001() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, "joined.csv"));
    }
    @Override public void set(Object rawObject) {
        JoinedModel object = (JoinedModel) rawObject;
    }
}