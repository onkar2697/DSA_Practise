package org.example;

import java.util.Stack;

public class StackProblems {

    public boolean validParanthasis(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If opening bracket, push into stack
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }

            else {
               // if there is no any opening bracket then it will be false
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                // Check if brackets matches for all the brackets
                if ((ch == ')' && top == '(') ||
                        (ch == ']' && top == '[') ||
                        (ch == '}' && top == '{')) {

                    st.pop();
                } else {
                    return false;
                }
            }
        }

        // once all brackets removed it should be empty
        return st.isEmpty();
    }

}
