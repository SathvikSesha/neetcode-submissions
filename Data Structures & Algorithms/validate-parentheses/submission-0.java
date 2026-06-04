class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else if (st.isEmpty()) {
                if (ch == ')' || ch == '}' || ch == ']') {
                    return false;
                }
            } else if (!st.isEmpty()) {
                if ((ch == ')' && (st.peek() == '[' || st.peek() == '{'))
                    || (ch == '}' && (st.peek() == '[' || st.peek() == '('))
                    || (ch == ']' && (st.peek() == '(' || st.peek() == '{')))
                    return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
