class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())
            return false;
        
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);
        int windowLength= s1.length();
        
        for(int i=0; i <= s2.length()-windowLength; i++){
            
            char[] c=s2.substring(i, i+windowLength).toCharArray();
            Arrays.sort(c);
            String substring=new String(c);
            if(substring.equals(sortedS1))
                return true;
        }

        return false;
    }
}
