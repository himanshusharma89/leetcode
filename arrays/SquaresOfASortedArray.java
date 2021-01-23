package arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        sort(nums);
        return nums;
    }

    public void sort(int[] arr) {
        int index, tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            index = i;
            tmp = 0;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[index] > arr[j])
                    index = j;

            tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }
}
