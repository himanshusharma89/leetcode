// Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

package arrays;

public class RemoveDuplicatefromSortedArray {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[cnt])
                continue;
            nums[++cnt] = nums[j];
        }
        return cnt + 1;
    }
}
