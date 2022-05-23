package LeetCode.Java.Top_100_Questions_Easy.Twosum;

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if(!map.containsKey(tmp)) {
                map.put(nums[i], i);
            } else {
                return new int [] {i, map.get(tmp)};
            }
        }
        return null;
    }
}