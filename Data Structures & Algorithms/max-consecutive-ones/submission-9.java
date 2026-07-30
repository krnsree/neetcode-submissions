class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0, curLen = 0;
        for (int num : nums) {
            curLen = (num == 1) ? curLen + 1 : 0;
            maxLen = Math.max(maxLen, curLen);
        }
        return maxLen;
    }
}