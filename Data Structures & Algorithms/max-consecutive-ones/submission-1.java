class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int mLength=0;
        int cLength=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                mLength= Math.max(cLength,mLength);
                cLength=0;
            }else
                cLength++;
        }
        return Math.max(cLength,mLength);
    }
}