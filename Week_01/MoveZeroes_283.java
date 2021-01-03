/**
 * @Author: wucb
 * @Date: 2021/1/3 20:41
 * @Description: https://leetcode-cn.com/problems/move-zeroes/
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 */
public class MoveZeroes_283 {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    /**
     * 0元素可近似理解为空闲的元素，类似磁盘的空隙和碎片
     * 我们把非0的元素移动过去让整个空间更加紧凑
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        // 第一次遍历把非零的元素全部移动到前面,最坏情况没有0全部元素都放置在原来的位置
        int nonZeroIndex = 0;

        // 非0的元素移动到前面
        for (int loopIndex=0; loopIndex<nums.length; loopIndex++) {
            // 假如遍历到指定下标的值不为0则把这个大于0的值赋值给nonZeroIndex
            if (nums[loopIndex] != 0) {
                nums[nonZeroIndex++] = nums[loopIndex];
            }
        }

        // 下一步处理0的元素
        // 剩余的位置用0填满即可，0的值都一样无所谓先后顺序，
        for (int fillZeroIndex=nonZeroIndex; fillZeroIndex<nums.length; fillZeroIndex++) {
            nums[fillZeroIndex] = 0;
        }

        for (int i : nums) {
            System.out.println(i);
        }

    }


}
