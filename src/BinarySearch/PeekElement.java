package BinarySearch;

public class PeekElement {
    static void main() {
        int[] nums = {1,4,7,10,14,16,18};
        System.out.println(findPeek(nums,15));
    }

    static int findPeek(int[] arr,int target){
//        int ans = 0;
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
//                ans = arr[mid];
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
