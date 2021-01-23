// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

package arrays;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, tmp;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
                j++;
            }
        }
    }
}
