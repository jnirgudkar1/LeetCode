class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        nums[k] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[k] != nums[i]) {
                System.out.println(nums[i]);
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}