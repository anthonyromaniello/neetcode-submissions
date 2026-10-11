class Solution {
    public boolean isValid(String s) {
        Stack<Character> pStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                pStack.push(c);
            }
            else if (c=='}' || c==')' || c==']') {
                if (pStack.isEmpty()) return false;
                char top = pStack.pop();
                if ((c == ')' && top != '(') ||
                c=='}' && top != '{' || c==']' &&
                top != '[') return false;
            }
            
        }
        return pStack.isEmpty();
    }
}
