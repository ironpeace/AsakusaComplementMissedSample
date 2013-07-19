package ironpeace.operator;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowBoundary;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.flow.graph.ShuffleKey;
import com.asakusafw.vocabulary.operator.KeyInfo;
import com.asakusafw.vocabulary.operator.MasterBranch;
import com.asakusafw.vocabulary.operator.MasterJoin;
import com.asakusafw.vocabulary.operator.OperatorFactory;
import com.asakusafw.vocabulary.operator.OperatorInfo;
import ironpeace.modelgen.dmdl.model.ModelA;
import ironpeace.modelgen.dmdl.model.ModelB;
import ironpeace.modelgen.dmdl.model.PreJoinedModel;
import java.util.Arrays;
import javax.annotation.Generated;
/**
 * {@link CmsOperator}に関する演算子ファクトリークラス。
 * @see CmsOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1")@OperatorFactory(CmsOperator.class) public class CmsOperatorFactory {
    /**
     */
    public static final class BranchWithJoin implements Operator {
        private final FlowElementResolver $;
        /**
         */
        public final Source<ModelA> bmissed;
        /**
         */
        public final Source<ModelA> other;
        BranchWithJoin(Source<ModelB> modelB, Source<ModelA> modelA) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(MasterBranch.class);
            builder.declare(CmsOperator.class, CmsOperatorImpl.class, "branchWithJoin");
            builder.declareParameter(ModelB.class);
            builder.declareParameter(ModelA.class);
            builder.addInput("modelB", modelB, new ShuffleKey(Arrays.asList(new String[]{"keycode"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder.addInput("modelA", modelA, new ShuffleKey(Arrays.asList(new String[]{"keycode"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder.addOutput("bmissed", modelA);
            builder.addOutput("other", modelA);
            builder.addAttribute(FlowBoundary.SHUFFLE);
            builder.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder.toResolver();
            this.$.resolveInput("modelB", modelB);
            this.$.resolveInput("modelA", modelA);
            this.bmissed = this.$.resolveOutput("bmissed");
            this.other = this.$.resolveOutput("other");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public CmsOperatorFactory.BranchWithJoin as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param modelB
     * @param modelA
     * @return 生成した演算子オブジェクト
     * @see CmsOperator#branchWithJoin(ModelB, ModelA)
     */
    @OperatorInfo(kind = MasterBranch.class, input = {@OperatorInfo.Input(name = "modelB", type = ModelB.class, position 
                = 0),@OperatorInfo.Input(name = "modelA", type = ModelA.class, position = 1)}, output = {@OperatorInfo.
                Output(name = "bmissed", type = ModelA.class),@OperatorInfo.Output(name = "other", type = ModelA.class)}
            , parameter = {}) public CmsOperatorFactory.BranchWithJoin branchWithJoin(@KeyInfo(group = {@KeyInfo.Group(
                expression = "keycode")}, order = {}) Source<ModelB> modelB,@KeyInfo(group = {@KeyInfo.Group(expression 
                = "keycode")}, order = {}) Source<ModelA> modelA) {
        return new CmsOperatorFactory.BranchWithJoin(modelB, modelA);
    }
    /**
     */
    public static final class Joined implements Operator {
        private final FlowElementResolver $;
        /**
         */
        public final Source<PreJoinedModel> joined;
        /**
         * 結合に失敗したデータ
         */
        public final Source<ModelB> missed;
        Joined(Source<ModelA> modelA, Source<ModelB> modelB) {
            OperatorDescription.Builder builder0 = new OperatorDescription.Builder(MasterJoin.class);
            builder0.declare(CmsOperator.class, CmsOperatorImpl.class, "joined");
            builder0.declareParameter(ModelA.class);
            builder0.declareParameter(ModelB.class);
            builder0.addInput("modelA", modelA, new ShuffleKey(Arrays.asList(new String[]{"keycode"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder0.addInput("modelB", modelB, new ShuffleKey(Arrays.asList(new String[]{"keycode"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder0.addOutput("joined", PreJoinedModel.class);
            builder0.addOutput("missed", modelB);
            builder0.addAttribute(FlowBoundary.SHUFFLE);
            builder0.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder0.toResolver();
            this.$.resolveInput("modelA", modelA);
            this.$.resolveInput("modelB", modelB);
            this.joined = this.$.resolveOutput("joined");
            this.missed = this.$.resolveOutput("missed");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName0 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public CmsOperatorFactory.Joined as(String newName0) {
            this.$.setName(newName0);
            return this;
        }
    }
    /**
     * @param modelA
     * @param modelB
     * @return 生成した演算子オブジェクト
     * @see CmsOperator#joined(ModelA, ModelB)
     */
    @OperatorInfo(kind = MasterJoin.class, input = {@OperatorInfo.Input(name = "modelA", type = ModelA.class, position = 
                0),@OperatorInfo.Input(name = "modelB", type = ModelB.class, position = 1)}, output = {@OperatorInfo.
                Output(name = "joined", type = PreJoinedModel.class),@OperatorInfo.Output(name = "missed", type = ModelB
                .class)}, parameter = {}) public CmsOperatorFactory.Joined joined(@KeyInfo(group = {@KeyInfo.Group(
                expression = "keycode")}, order = {}) Source<ModelA> modelA,@KeyInfo(group = {@KeyInfo.Group(expression 
                = "keycode")}, order = {}) Source<ModelB> modelB) {
        return new CmsOperatorFactory.Joined(modelA, modelB);
    }
}