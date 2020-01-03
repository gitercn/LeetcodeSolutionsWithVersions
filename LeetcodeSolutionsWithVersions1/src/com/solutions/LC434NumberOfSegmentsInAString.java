package com.solutions;

public class LC434NumberOfSegmentsInAString {
    public static void main(String[] args){
//        String s = "   Hello, my name is John   ";
        String s = ", , , ,        a, eaefa";

        // Remove beginning spaces of s
        String news = s;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                news = s.substring(i + 1, s.length());
            } else {
                break;
            }
        }

        // Remove endding spaces of s
        String news2 = news;
        for(int i = 0; i < news.length(); i++){
            if(news.charAt(news.length() - i - 1) == ' '){
                news2 = news.substring(0, news.length() - i - 1);
            } else {
                break;
            }
        }

        // Check spaces and use a previousIndex in cases there are contiguous spaces in between
        int count = 0;
        int previousIndex = 0;
        for(int i = 0; i < news2.length(); i++){
            if(news2.charAt(i) == ' '){
                if(previousIndex != 0 && previousIndex == i - 1){
                    previousIndex = i;
                } else {
                    count++;
                }

                previousIndex = i;
            }
        }

        // If string is empty, return 0, else return space count + 1
        if (count == 0 && news2.length() == 0){
            System.out.println(count);
        }
        System.out.println(count + 1);
    }
}
