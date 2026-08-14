class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder res= new StringBuilder();
        ArrayList<Integer> lengths= new ArrayList<>();
        for(String str: strs)
            lengths.add(str.length());
        for(int length: lengths)
            res.append(length).append(',');
        res.append('#');
        for(String str: strs)
            res.append(str);
        return res.toString();
    }

    public List<String> decode(String str) {

        if(str.isEmpty())
            return new ArrayList<>();
        List<String> res= new ArrayList<>();
        List<Integer> sizes= new ArrayList<>();
        int i=0;
        while(str.charAt(i) != '#'){
            StringBuilder cur= new StringBuilder();
            while(str.charAt(i) != ','){
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;

        for(int size: sizes){
            res.add(str.substring(i, i + size));
            i=i+size;
        }

        return res;
    }
}
