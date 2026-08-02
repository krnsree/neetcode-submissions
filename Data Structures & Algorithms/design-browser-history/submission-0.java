class BrowserHistory {

    Node curr;

    public BrowserHistory(String homepage) {
        curr= new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next=newNode;
        newNode.prev=curr;
        curr=newNode; 
    }
    
    public String back(int steps) {
        
        while(steps > 0 && curr.prev != null){
            curr = curr.prev;
            steps --;
        }

        return curr.val;
    }
    
    public String forward(int steps) {
        
        while(steps > 0 && curr.next != null){
            curr = curr.next;
            steps --;
        }

        return curr.val;
    }
}

class Node {

    String val;
    Node next;
    Node prev;

    Node(String val){
        this(val, null, null);
    }

    Node(String val, Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */