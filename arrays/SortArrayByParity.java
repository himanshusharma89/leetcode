// Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

// You may return any answer array that satisfies this condition.

package arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = 0, tmp;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (i != j) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
                j++;
            }
        }
        return nums;
    }
}
