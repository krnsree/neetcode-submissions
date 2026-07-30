class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n= arr.length;
        int maxNumber=-1;
        int[] ans = new int[n];

        for(int i=n-1; i>=0;i--){
            ans[i]=maxNumber;
            maxNumber=Math.max(arr[i], maxNumber);
        }
        return ans;
    }
}