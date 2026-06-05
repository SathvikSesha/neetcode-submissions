class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if("+-*/".indexOf(tokens[i])==-1){
                int num = Integer.parseInt(tokens[i]);
                st.push(num);
            }
            else{
                int b = st.pop();
                int a = st.pop();
                switch(tokens[i]){
                    case "+":
                        st.push(a+b);
                        break;
                    case "-":
                        st.push(a-b);
                        break;
                    case "*":
                        st.push(a*b);
                        break;
                    case "/":
                        st.push(a/b);
                        break;
                }
            }
        }
        return st.pop();
    }
}
