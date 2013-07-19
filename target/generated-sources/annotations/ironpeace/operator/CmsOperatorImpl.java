package ironpeace.operator;
import ironpeace.modelgen.dmdl.model.ModelA;
import ironpeace.modelgen.dmdl.model.ModelB;
import ironpeace.modelgen.dmdl.model.PreJoinedModel;
import javax.annotation.Generated;
/**
 * {@link CmsOperator}に関する演算子実装クラス。
 */
@Generated("OperatorImplementationClassGenerator:0.0.1") public class CmsOperatorImpl extends CmsOperator {
    /**
     * インスタンスを生成する。
     */
    public CmsOperatorImpl() {
        return;
    }
    @Override public PreJoinedModel joined(ModelA modelA, ModelB modelB) {
        throw new UnsupportedOperationException("マスタ結合演算子は組み込みの方法で処理されます");
    }
}