class MyStack {
 ArrayDeque<Integer> q ;
    public MyStack() {
        q = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
     return q.removeLast();
    }
    
    public int top() {
        int t = q.removeLast();
        q.addLast(t);
        return t;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */