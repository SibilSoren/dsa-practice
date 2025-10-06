package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindFirstandLastIndex {
    static void main() {
        int[] nums = {5,7,7,8,8,10};
        int[] result = findFirstandLastIndex(nums,8);
        System.out.println(Arrays.toString(result));
    }

    static int[] findFirstandLastIndex(int[] nums, int target){
        if(nums.length == 0) return new int[] {-1,-1};
        return new int[] {floorIndex(nums,target),peekIndex(nums,target)};
    }

    static int peekIndex(int[] arr,int target){
        int ans = -1;
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid  + 1;
            }
        }
        return ans;
    }

    static int floorIndex(int[] arr,int target){
        int n = arr.length;
        int ans = -1;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid  + 1;
            }
        }
        return ans;
    }
}
