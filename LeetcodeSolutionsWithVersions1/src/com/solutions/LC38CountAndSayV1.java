package com.solutions;

public class LC38CountAndSayV1 {
    public static void main(String[] args) {
        // recursively递归
        System.out.println(countAndSay(30));

    }

    public static String countAndSay(int n) {



        return count(n);
    }

    private static String count(int n) {
        if(n == 1){
            return "1";
        }
        if(n == 2){
            return "11";
        }

        StringBuilder sb2 = new StringBuilder();
        String str3 = count(n-1);
        int count = 1;
        for (int i = 1; i < str3.length(); i++){
            // count
            char previousChar = str3.charAt(i-1);
            char currentChar = str3.charAt(i);

            if(currentChar == previousChar){
                count ++;
            }
            if (currentChar != previousChar){
                sb2.append(count);
                sb2.append(previousChar);
                count = 1;
            }
            if (i == str3.length() - 1) {
                sb2.append(count);
                sb2.append(currentChar);
            }
        }

        return sb2.toString();
    }

}
