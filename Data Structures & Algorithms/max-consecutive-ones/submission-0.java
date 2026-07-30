class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int mLength=0;
        int cLength=0;

        for(int num : nums){
            cLength = (num == 1)? ++cLength : 0;
            mLength=Math.max(mLength,cLength);
        }
        return Math.max(mLength,cLength);
    }
}