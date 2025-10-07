package BinarySearch;

public class SearchRotatedSortedArray {
    static void main() {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums,6));
    }

    public static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1 && nums[0] == target){
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        int minElementIndex = findMinElement(nums);
        int foundInLeft = binarySearch(nums,target,start,minElementIndex - 1);
        int foundInRight  = binarySearch(nums,target,minElementIndex, end);

        if(foundInLeft != -1) return foundInLeft;
        if(foundInRight != -1) return foundInRight;

        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findMinElement(int[] nums){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;
            if(nums[mid] < nums[prev] && nums[mid] < nums[next]){
                return mid;
            }else if(nums[start] <= nums[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
