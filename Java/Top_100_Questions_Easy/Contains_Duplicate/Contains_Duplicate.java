package LeetCode.Java.Top_100_Questions_Easy.Contains_Duplicate;

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else
                return true;
        }
        return false;
    }
}