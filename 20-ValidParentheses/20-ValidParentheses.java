// Last updated: 9/26/2025, 9:52:58 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='(' || c=='{'||c=='['){
                stack.push(c);
            }
            else if(c==')' && !stack.empty() && stack.peek()=='('){
                stack.pop();
            }
            else if(c=='}' && !stack.empty() && stack.peek()=='{'){
                stack.pop();
            }
            else if(c==']' && !stack.empty() && stack.peek()=='['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.empty();
        
        
    }
}