// Last updated: 9/22/2025, 9:48:27 PM


class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    int peekel;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        if (input.isEmpty()) {
            peekel = x;
        }
        input.push(x);
    }
    
    public int pop() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }
    
    public int peek() {
        if (!output.isEmpty()) {
            return output.peek();
        }
        return peekel;
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
