// Given a non-negative integer x, compute and return the square root of x.

// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

package arrays;

public class SqrtUsingBinarySearch {
    public int mySqrt(int x) {
        int left=0, right=x, mid=0, ans=0;
        while(left<=right){
            mid = (left + right)/2;
            if((long)mid*mid==x){
                ans = mid;
                break;
            }
            if((long)mid*mid > x)
                right = mid-1;
            else{
                left = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
