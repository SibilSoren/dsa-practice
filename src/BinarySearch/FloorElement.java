package BinarySearch;

public class FloorElement {
    static void main() {
        int[] nums = {1,4,7,10,14,16,18};
        System.out.println(findFloor(nums,15));
    }

    static int findFloor(int[] arr, int target){
        int n = arr.length;
        int start  = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
