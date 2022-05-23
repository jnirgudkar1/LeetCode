package LeetCode.Java.Top_100_Questions_Easy.Plus_One;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        
        for(; n >= 0; n--) {
            int tmp = digits[n];
            if(tmp != 9) {
                digits[n]++;
                return digits;
            }
            digits[n] = 0;
        }
        
        int [] arr = new int [digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}