package Questions.Arrays;

public class MaxSumInSubArray {

    static void main() {
        int arr[] = {5, 2, -1, 0, 3};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }

    static int maxSum(int[] nums, int k){
        int n = nums.length;
        if(n < k) return -1;

        int max_sum = 0;
        for(int i = 0 ; i < k; i++){
            max_sum += nums[i];
        }

        int window_sum = max_sum;
        for(int i = k ; i < n ; i++){
            window_sum += nums[i] - nums[i - k];
            max_sum = Math.max(max_sum,window_sum);
        }

        return max_sum;
    }
}
