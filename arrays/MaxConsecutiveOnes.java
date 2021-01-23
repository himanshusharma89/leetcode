/// Given a binary array, find the maximum number of consecutive 1s in this array.

package arrays;

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length, consecutive, tmp = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                consecutive = 1;
                for (int j = i + 1; j < len; j++) {
                    if (nums[i] == 1 && nums[j] == 1) {
                        consecutive++;
                    } else
                        break;
                }
                if (consecutive > tmp)
                    tmp = consecutive;
            }

        }
        return tmp;
    }
}