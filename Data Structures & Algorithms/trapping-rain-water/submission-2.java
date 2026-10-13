class Solution {
    public int trap(int[] height) {
        
        if(height.length == 0)
            return 0;
        
        Stack<Integer> stack= new Stack<>();
        int res=0;

        for(int i=0; i< height.length; i++){
            while(!stack.isEmpty() && height[i] >= height[stack.peek()]){
                int mid = height[stack.pop()];
                if(!stack.isEmpty()){
                    int right = height[i];
                    int left = height[stack.peek()];
                    res+=(Math.min(right, left) - mid) * (i-stack.peek()-1);
                }
            }
            stack.push(i);
        }
        return res;
    }
}
