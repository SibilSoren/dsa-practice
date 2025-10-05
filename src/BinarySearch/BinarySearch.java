package BinarySearch;

public class BinarySearch {
    static void main() {
        int[] arr = {1,2,3,4,5,6,8,9};
        System.out.println(binarySearch(arr,8));
    }

    static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + ((end-start) / 2 );
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
