class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int n = students.length;
        int idx = 0;

        int res = n;
        for(int sandwitch : sandwiches){

            int cnt =0;
            while(cnt<n && students[idx] != sandwitch){
                cnt++;
                idx= ++idx%n;
            }
            if( students[idx] == sandwitch){
                students[idx] = -1;
                res--;
            }else{
                break;
            }
        }
        return res;
    }
}