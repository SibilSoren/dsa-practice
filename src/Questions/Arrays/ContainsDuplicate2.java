package Questions.Arrays;

import java.util.HashSet;

public class ContainsDuplicate2 {
    static void main() {

    }
//    https://leetcode.com/problems/contains-duplicate-ii/description/
    static boolean containsDuplicate(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ;  i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
