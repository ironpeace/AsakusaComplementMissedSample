package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.JoinedModel;
/**
 * An abstract implementation of {@link JoinedModel} exporter description using Direct I/O CSV.
 */
public abstract class AbstractJoinedModelCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends JoinedModel> getModelType() {
        return JoinedModel.class;
    }
    @Override public Class<JoinedModelCsvFormat> getFormat() {
        return JoinedModelCsvFormat.class;
    }
}