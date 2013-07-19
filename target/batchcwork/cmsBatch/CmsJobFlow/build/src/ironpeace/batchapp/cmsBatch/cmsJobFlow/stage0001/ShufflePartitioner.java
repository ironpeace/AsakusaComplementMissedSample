package ironpeace.batchapp.cmsBatch.cmsJobFlow.stage0001;
import org.apache.hadoop.mapreduce.Partitioner;
/**
 * ステージ#1シャッフルで利用するパーティショナー。
 */
@SuppressWarnings("deprecation") public final class ShufflePartitioner extends Partitioner<ShuffleKey, ShuffleValue> {
    @Override public int getPartition(ShuffleKey key, ShuffleValue value, int numPartitions) {
        return(this.getHashCode(key) & Integer.MAX_VALUE) % numPartitions;
    }
    private int getHashCode(ShuffleKey key) {
        int portId = key.getSegmentId();
        int result = this.portIdToElementId(portId);
        switch(portId) {
            case 1:
                result = result * 31 + key.groupElem0Term1.hashCode();
                break;
            case 2:
                result = result * 31 + key.groupElem0Term1.hashCode();
                break;
            case 3:
                result = result * 31 + key.groupElem1Term1.hashCode();
                break;
            case 4:
                result = result * 31 + key.groupElem1Term1.hashCode();
                break;
            default:
                throw new AssertionError(portId);
        }
        return result;
    }
    private int portIdToElementId(int pid) {
        switch(pid) {
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
                return 1;
            default:
                return -1;
        }
    }
}