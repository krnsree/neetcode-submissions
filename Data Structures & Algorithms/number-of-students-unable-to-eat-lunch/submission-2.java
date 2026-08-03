class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         
         int n= students.length;
         int res = n;
         int[] cnt = new int[2];

         for(int i =0; i< n; i++){
            cnt[students[i]]++;
         }

         for(int sandwich : sandwiches){
            if(cnt[sandwich] >0){
                cnt[sandwich]--;
                res--;
            }else{
                break;
            }
         }
         return res;
    }
}