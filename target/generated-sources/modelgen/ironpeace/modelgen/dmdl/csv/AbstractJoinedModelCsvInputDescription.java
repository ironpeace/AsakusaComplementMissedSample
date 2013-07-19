package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.JoinedModel;
/**
 * An abstract implementation of {@link JoinedModel} importer description using Direct I/O CSV.
 */
public abstract class AbstractJoinedModelCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends JoinedModel> getModelType() {
        return JoinedModel.class;
    }
    @Override public Class<JoinedModelCsvFormat> getFormat() {
        return JoinedModelCsvFormat.class;
    }
}