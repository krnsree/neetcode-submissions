class Solution {
    public int calPoints(String[] operations) {
        
        Deque<Integer> stack= new ArrayDeque<>();
        int sum=0;

        for(String operation : operations){
            switch(operation){
                case "+":
                    int top = stack.pop();
                    int newTop = stack.peek();
                    stack.push(top);
                    stack.push(top+newTop);
                    sum+=stack.peek();
                break;

                case "C":
                    sum -=stack.pop();
                break;

                case "D":
                    stack.push(stack.peek()*2);
                    sum+=stack.peek();
                break;

                default:
                    stack.push(Integer.valueOf(operation));
                    sum+=stack.peek();
                break;
            }
        }
        return sum;
    }
}