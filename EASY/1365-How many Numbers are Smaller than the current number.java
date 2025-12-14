import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                if (nums[i] == sorted[j]) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }
}
