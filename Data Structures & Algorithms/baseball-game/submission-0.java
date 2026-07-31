class Solution {
    public int calPoints(String[] operations) {
        
        Deque<Integer> stack= new ArrayDeque<>();

        for(String operation : operations){
            switch(operation){
                case "+":
                    int top = stack.pop();
                    int newTop = stack.peek();
                    stack.push(top);
                    stack.push(top+newTop);
                break;

                case "C":
                    stack.pop();
                break;

                case "D":
                    stack.push(stack.peek()*2);
                break;

                default:
                    stack.push(Integer.valueOf(operation));
                break;
            }
        }

        int sum=0;

        for(int score : stack)
            sum +=score;

        return sum;
    }
}