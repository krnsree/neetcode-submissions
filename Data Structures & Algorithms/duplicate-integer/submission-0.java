class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> numsNotDuplicated=Arrays.stream(nums)
                                 .boxed()
                                 .collect(Collectors.toSet());;
        if(numsNotDuplicated.size() < nums.length)
            return true;
        return false;
    }
}