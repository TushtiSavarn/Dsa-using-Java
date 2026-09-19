class Solution {
    public boolean isValid(String s) {
        Stack<Character> paren = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                paren.push(c);
            }
            else {
                if(paren.isEmpty())
                    return false;
                char top = paren.peek();
                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')) {
                    return false;
                }
                paren.pop();
            }

        }
        return paren.isEmpty();
    }
}