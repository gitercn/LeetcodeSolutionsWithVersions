package com.solutions;

public class LC58LengthofLastWordV1 {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));

    }

    public static int lengthOfLastWord(String s) {
        int indexOfLastSpace = s.lastIndexOf(' ');
        if(indexOfLastSpace == -1){
            return 0;
        }

        return s.length() - indexOfLastSpace - 1;
    }

}
