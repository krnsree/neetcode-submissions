class Solution {
    public boolean isValid(String s) {

        if(s.length()<=1)
            return false;
        
        Deque<Character> stack= new ArrayDeque<>();
        char[] charArray= s.toCharArray();

        for(char c: charArray){

            switch(c){
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                break;
                default:
                    stack.push(c);
                break;
            }
        }

        if(!stack.isEmpty())
            return false;

        return true;
    }
}
