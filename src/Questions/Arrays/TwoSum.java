package Questions.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static void main() {
//        nums = [2,7,11,15], target = 9
    }

    static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[] {map.get(rem),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}
