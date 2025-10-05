package LinearSearch;

public class MinimumElement {
    static void main() {
        int[] nums = {1,-1,3,-2,5,6};
        System.out.println(minElement(nums));
    }

    static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
