class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int mLength=0;
        int cLength=0;

        for(int num : nums){
            if(num == 0)
                cLength=0;
            else{
                cLength++;
                mLength= Math.max(cLength,mLength);
            }
        }
        return mLength;
    }
}