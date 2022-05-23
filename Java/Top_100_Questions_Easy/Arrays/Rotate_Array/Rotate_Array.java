package LeetCode.Java.Top_100_Questions_Easy.Rotate_Array;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate_helper(nums, 0, nums.length-1);
        rotate_helper(nums, 0, k-1);
        rotate_helper(nums, k, nums.length-1);
        
    }
    
    public void rotate_helper(int[] nums, int i, int j) {
        while(i <= j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}