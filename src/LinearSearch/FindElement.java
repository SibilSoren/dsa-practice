package LinearSearch;

public class FindElement {
    static void main() {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(findElement(nums,4));
    }

    static int findElement(int[] arr,int target){
        if(arr.length == 0) return -1;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
