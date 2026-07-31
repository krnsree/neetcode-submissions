class MinStack {

    private Deque<Long> stack;
    long min;

    public MinStack() {
        stack=new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            min= val;
        }else{
            stack.push(val-min);
            min=Math.min(min, val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        long pop = stack.pop();
        min= pop < 0? min - pop : min; 
    }
    
    public int top() {
        long top = stack.peek();
        return top > 0? (int) (top+min) : (int) min;
    }
    
    public int getMin() {
        return (int) min;
    }
}
