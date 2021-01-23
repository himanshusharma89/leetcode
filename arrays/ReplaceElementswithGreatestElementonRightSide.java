// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

// After doing so, return the array.

package arrays;

public class ReplaceElementswithGreatestElementonRightSide {
    public int[] replaceElements(int[] arr) {
        int greatest;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                arr[i] = -1;
            else {
                greatest = arr[i + 1];
                for (int j = i + 1; j < arr.length; j++) {
                    if (greatest <= arr[j])
                        greatest = arr[j];
                }
                arr[i] = greatest;
            }
        }
        return arr;
    }
}
