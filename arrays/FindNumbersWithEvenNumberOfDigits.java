/// Given an array nums of integers, return how many of them contain an even number of digits.

package arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int cnt = 0, digits;
        for (int element : nums) {
            digits = 0;
            while (element > 0) {
                digits++;
                element /= 10;
            }
            if (digits % 2 == 0)
                cnt++;
        }
        return cnt;
    }
}
