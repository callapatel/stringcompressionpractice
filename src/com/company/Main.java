package com.company;

public class Main {
    //4. Implement a method to perform a basic string compression using the counts of repeated characters. For example, the string aabccccaaa would become a2b1c4a3. If the compressed string would not become smaller than the original string, your method should return the original string.
    public static void main(String[] args) {
	String temp = "aabccccaaa";
        String outString = CompressionOrNot(temp);
        System.out.println(outString);

    }

    public static String CompressionOrNot(String str) {

            if (str.isEmpty()) {
                return "";
            }

            char[] chars = str.toCharArray();
            StringBuilder builder = new StringBuilder();

            int count = 1;
            char prev = chars[0];
            for (int i = 1; i < chars.length; i++) {
                char current = chars[i];
                if (current == prev) {
                    count++;
                } else {
                    builder.append(prev).append(count);
                    count = 1;
                }
                prev = current;
            }
            return builder.append(prev).append(count).toString();
        }
}
