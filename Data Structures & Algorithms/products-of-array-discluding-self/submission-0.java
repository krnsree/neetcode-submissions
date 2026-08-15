class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int aProd=1;
        int numZero=0;
        for(int num : nums){
            if(num != 0)
                aProd *= num;
            else
                numZero++;
        }

        if(numZero > 1)
            return new int[nums.length];
        
        int[] res= new int[nums.length];

        for(int i =0; i< nums.length; i++){

            if(numZero > 0){
                if(nums[i] == 0)
                    res[i] = aProd;
            }
            else{
                res[i] = aProd/nums[i];
            }
        }

        return res;
    }
}  
