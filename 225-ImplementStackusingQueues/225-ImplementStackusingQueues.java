// Last updated: 1/17/2026, 4:27:13 PM
1class MyStack {
2    Queue<Integer> q;
3
4    public MyStack() {
5        q = new LinkedList<>();
6    }
7    
8    public void push(int x) {
9        q.add(x);
10        for(int i =1;i<q.size();i++){
11            q.add(q.remove());
12        }
13        
14    }
15    
16    public int pop() {
17        return q.remove();
18        
19    }
20    
21    public int top() {
22        return q.peek();
23        
24    }
25    
26    public boolean empty() {
27        return q.isEmpty();
28
29        
30    }
31}
32
33/**
34 * Your MyStack object will be instantiated and called as such:
35 * MyStack obj = new MyStack();
36 * obj.push(x);
37 * int param_2 = obj.pop();
38 * int param_3 = obj.top();
39 * boolean param_4 = obj.empty();
40 */