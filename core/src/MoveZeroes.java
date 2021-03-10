import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author Silence 000996
 * @data 2021-03-10
 */
public class MoveZeroes {
    //遍历数组，遇到非0，则往前放，用另外一个下标记录到存放的位置
    //最后将剩余的数字设为0
    public static void moveZeroes(int[] nums) {
        if(nums == null){
            return;
        }
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i = j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
