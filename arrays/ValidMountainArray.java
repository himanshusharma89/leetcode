// Given an array of integers arr, return true if and only if it is a valid mountain array.

// Recall that arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]


package arrays;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr == null)
            return false;
        boolean status = arr[0] < arr[1];
        if (!status)
            return false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                return false;
            if (status) {
                if (arr[i - 1] > arr[i])
                    status = false;
            } else if (arr[i] > arr[i - 1])
                return false;
        }

        return !status;

    }
}
