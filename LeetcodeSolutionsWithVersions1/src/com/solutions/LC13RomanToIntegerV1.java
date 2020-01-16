package com.solutions;

public class LC13RomanToIntegerV1 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sLength = s.length();
        int result = 0;
        for (int i = 0; i < sLength; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i + 1 < sLength) {
                        if (s.charAt(i + 1) == 'V') {
                            result = result + 4;
                            i++;
                            break;
                        }

                        if (s.charAt(i + 1) == 'X') {
                            result = result + 9;
                            i++;
                            break;
                        }

                    }
                    result = result + 1;
                    break;
                case 'V':
                    result = result + 5;
                    break;
                case 'X':
                    if (i + 1 < sLength) {
                        if (s.charAt(i + 1) == 'L') {
                            result = result + 40;
                            i++;
                            break;
                        }
                        if (s.charAt(i + 1) == 'C') {
                            result = result + 90;
                            i++;
                            break;
                        }
                    }
                    result = result + 10;
                    break;
                case 'L':
                    result = result + 50;
                    break;
                case 'C':
                    if (i + 1 < sLength) {
                        if (s.charAt(i + 1) == 'D') {
                            result = result + 400;
                            i++;
                            break;
                        }
                        if (s.charAt(i + 1) == 'M') {
                            result = result + 900;
                            i++;
                            break;
                        }
                    }

                    result = result + 100;
                    break;
                case 'D':
                    result = result + 500;
                    break;
                case 'M':
                    result = result + 1000;
                    break;
            }
        }
        return result;
    }
}
