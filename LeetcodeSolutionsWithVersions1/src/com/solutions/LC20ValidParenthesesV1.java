package com.solutions;

import java.util.Stack;

public class LC20ValidParenthesesV1 {
    public static void main(String[] args) {
        String s = "{[]}";
//        s = "([)]";
        System.out.println(isValid2(s));
    }

    public static boolean isValid(String s) {
        int sLength = s.length();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < sLength; i++) {
            if (s.charAt(i) == ')') {
                if (!stack.empty()) {
                    if (stack.pop() != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (!stack.empty()) {
                    if (stack.pop() != '[') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (!stack.empty()) {
                    if (stack.pop() != '{') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isValid2(String s) {
//        Stack st = new Stack();
//        char[] str = s.toCharArray();
//        if (str.length % 2 != 0) return false;
//
//        // System.out.println(st.peek());
//        for (int i = 0; i < str.length; i++) {
//            if (str[i] == '(' || str[i] == '{' || str[i] == '[') {
//                st.push(new Character(str[i]));
//            } else {
//                if (st.empty()) return false;
//                else if (str[i] == ')' && st.peek() == '(') st.pop();
//                else if (str[i] == '}' && st.peek() == '{') st.pop();
//                else if (str[i] == ']' && st.peek() == '[') st.pop();
//
//            }
//        }
//        return st.empty();
        return false;

    }

}
