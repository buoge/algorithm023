import com.sun.tools.javac.util.ArrayUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wucb
 * @Date: 2021/1/3 22:03
 * @Description:
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 链接：https://leetcode-cn.com/problems/two-sum
 */
public class TwoSum_001 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] twoSumIndex = twoSum(nums,17);
        System.out.println(twoSumIndex[0]+","+twoSumIndex[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("nums is null");
        }

        Map<Integer,Integer> valCacheMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int loopVal = nums[i];
            int matchVal = target - loopVal;
            if (valCacheMap.containsKey(matchVal)) {
                int matchValIndex = valCacheMap.get(matchVal);
                return new int[] { matchValIndex, i};
            } else {
                valCacheMap.put(loopVal,i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
