import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 剑指 Offer 40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 * <p>
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 * @author Silence 000996
 * @data 2021-03-22
 */
public class KLeastNumbers {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) return new int[0];
        //大顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, (x, y) -> y - x);
        for (int result : arr) {
            //堆大小够放入元素，或者放入的元素小于堆顶
            if (pq.size() < k || result < pq.peek()) {
                pq.add(result);
            }
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        Iterator<Integer> it = pq.iterator();
        int i = 0;
        while (it.hasNext()) {
            result[i++] = it.next();
        }
        return result;
    }

}
