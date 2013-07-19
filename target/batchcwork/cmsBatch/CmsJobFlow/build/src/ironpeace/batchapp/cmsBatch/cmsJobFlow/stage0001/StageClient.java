package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import com.asakusafw.runtime.stage.AbstractStageClient;
import com.asakusafw.runtime.stage.StageInput;
import com.asakusafw.runtime.stage.StageOutput;
import com.asakusafw.runtime.stage.StageResource;
import com.asakusafw.runtime.stage.input.BridgeInputFormat;
import com.asakusafw.runtime.stage.output.TemporaryOutputFormat;
import ironpeace.modelgen.dmdl.model.JoinedModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.io.NullWritable;
/**
 * ステージ1のジョブを実行するクライアント。
 */
public final class StageClient extends AbstractStageClient {
    @Override protected String getBatchId() {
        return "cmsBatch";
    }
    @Override protected String getFlowId() {
        return "CmsJobFlow";
    }
    @Override protected String getStageId() {
        return "stage0001";
    }
    @Override protected String getStageOutputPath() {
        return "target/hadoopwork/${execution_id}/cmsBatch/CmsJobFlow/stage0001";
    }
    @Override protected List<StageInput> getStageInputs() {
        List<StageInput> results = new ArrayList<StageInput>();
        Map<String, String> attributes = null;
        attributes = new HashMap<String, String>();
        attributes.put("basePath", "cms/input/");
        attributes.put("resourcePath", "modelB.csv");
        attributes.put("dataClass", "ironpeace.modelgen.dmdl.model.ModelB");
        attributes.put("formatClass", "ironpeace.modelgen.dmdl.csv.ModelBCsvFormat");
        results.add(new StageInput("__DIRECTIO__/modelB/cms/input", BridgeInputFormat.class, StageMapper1.class, 
                attributes));
        attributes = new HashMap<String, String>();
        attributes.put("basePath", "cms/input/");
        attributes.put("resourcePath", "modelA.csv");
        attributes.put("dataClass", "ironpeace.modelgen.dmdl.model.ModelA");
        attributes.put("formatClass", "ironpeace.modelgen.dmdl.csv.ModelACsvFormat");
        results.add(new StageInput("__DIRECTIO__/modelA/cms/input", BridgeInputFormat.class, StageMapper2.class, 
                attributes));
        return results;
    }
    @Override protected List<StageOutput> getStageOutputs() {
        List<StageOutput> results = new ArrayList<StageOutput>();
        results.add(new StageOutput("result0", NullWritable.class, JoinedModel.class, TemporaryOutputFormat.class));
        return results;
    }
    @Override protected List<StageResource> getStageResources() {
        List<StageResource> results = new ArrayList<StageResource>();
        return results;
    }
    @Override protected Class<ShuffleKey> getShuffleKeyClassOrNull() {
        return ShuffleKey.class;
    }
    @Override protected Class<ShuffleValue> getShuffleValueClassOrNull() {
        return ShuffleValue.class;
    }
    @Override protected Class<ShufflePartitioner> getPartitionerClassOrNull() {
        return ShufflePartitioner.class;
    }
    @Override protected Class<ShuffleSortComparator> getSortComparatorClassOrNull() {
        return ShuffleSortComparator.class;
    }
    @Override protected Class<ShuffleGroupingComparator> getGroupingComparatorClassOrNull() {
        return ShuffleGroupingComparator.class;
    }
    @Override protected Class<StageReducer> getReducerClassOrNull() {
        return StageReducer.class;
    }
}