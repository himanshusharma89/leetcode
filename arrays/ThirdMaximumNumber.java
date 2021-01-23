// Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.

// Note that the third maximum here means the third maximum distinct number.

package arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        sort(nums);
        int cnt = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[cnt])
                continue;
            nums[++cnt] = nums[j];
        }
        if (cnt + 1 < 3)
            return nums[cnt];
        return nums[cnt - 2];
    }

    public void sort(int[] arr) {
        int index, tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            index = i;
            tmp = 0;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[index] > arr[j])
                    index = j;
            if (index != i) {
                tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
    }
}
