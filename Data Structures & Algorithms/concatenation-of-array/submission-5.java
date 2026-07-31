class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n=nums.length;
        int[] newArr=new int[n*2];

        for(int i=0; i<n;i++){
            newArr[i]=newArr[i+n]=nums[i];
        }

        return newArr;
    }
}