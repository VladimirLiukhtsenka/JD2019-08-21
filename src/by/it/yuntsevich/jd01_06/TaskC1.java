package by.it.yuntsevich.jd01_06;

import java.util.regex.Pattern;

public class TaskC1 {
    public static void main(String[] args) {
        String[] text = Poem.text.split("\n");
        int maxLength = 0;
        for (int i = 0; i < text.length; i++) {
            if (maxLength < text[i].length()) {
                maxLength = text[i].length();
            }
        }

        Pattern pattern = Pattern.compile(" ");
        String[] s2 = new String[text.length];
        StringBuilder result;
        int lastIndex = 0;
        for (int i = 0; i < text.length; i++) {
            result = new StringBuilder(text[i]);
            lastIndex = 1;
//            System.out.println(result);
//            System.out.println(result.length());
//            System.out.println(maxLength);
            while (result.length() <= maxLength) {
//                System.out.println(result);
//                result.
                if (lastIndex == 1) {
                    lastIndex = result.indexOf(" ") + 1;
                    result.insert(lastIndex, " ");
                    lastIndex = result.indexOf(" ", lastIndex) + 1;
                } else {
                    lastIndex = result.indexOf(" ", lastIndex);
                    result.insert(++lastIndex, " ");
                    lastIndex += 2;
                }
                if (lastIndex > result.lastIndexOf(" ")) {
//                    System.out.println(lastIndex);
//                    System.out.println(result);
                    lastIndex = 1;
                }

            }
            s2[i] = result.toString();

        }

//        int maxLength =0;
//
//        while (matcher.find()) {
//            String string = matcher.group();
//            System.out.println(string);
//            if (maxLength<string.length())
//                maxLength=string.length();
//        }
//        String [] s = Poem.text.split("\n");
//
//        String [] s2 = new String[s.length];
//
//        Pattern pattern = Pattern.compile(" ");
//        StringBuilder result;
//        int lastIndex = 0;
//        for (int i = 0; i < s.length; i++) {
//            result = new StringBuilder(s[i]);
//            lastIndex = 0;
//            System.out.println(result);
//            System.out.println(result.length());
//            System.out.println(maxLength);
//            while (result.length() < maxLength) {
//                System.out.println(result);
//                if (lastIndex == 0) {
//                    lastIndex = result.indexOf(" ");
//                    result.insert(lastIndex, " ");
//                } else {
//                    lastIndex = result.indexOf(" ", lastIndex);
//                    result.insert(lastIndex, " ");
//                }
//                if (lastIndex > result.length() - 5) {
//                    lastIndex = 0;
//                }
//
//            }
//            s2[i] = result.toString();
//
//        }
        for (String s1 : s2) {
            System.out.println(s1);
        }
    }
//        }

//    private static void insert(StringBuilder result, int position) {
//
//    }
}