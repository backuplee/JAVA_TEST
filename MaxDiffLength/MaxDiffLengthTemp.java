package MaxDiffLength;

import java.lang.Math;

public class MaxDiffLengthTemp {
    public static void main(String[] args) {
        // System.out.println("mxdiflg Fixed Tests");
        String[] s1 = new String[] { "hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt",
                "znnnnfqknaz", "qqquuhii", "dvvvwz" };
        String[] s2 = new String[] { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
        int max1 = 0, max2 = 0, min1 = s1[0].length(), min2 = s2[0].length(), temp1 = 0, temp2 = 0;
        // System.out.println(s1.length);
        // System.out.println(s2.length);
        for (int i = 0; i < s1.length; i++) {
            temp1 = s1[i].length();
            max1 = Math.max(max1, temp1);
            min1 = Math.min(min1, temp1);
        }
        for (int i = 0; i < s2.length; i++) {
            temp2 = s2[i].length();
            max2 = Math.max(max2, temp2);
            min2 = Math.min(min2, temp2);
        }
        System.out.println(max1);
        System.out.println(min1);
        System.out.println(max2);
        System.out.println(min2);
        System.out.println(Math.max((max1 - min2), (max2 - min1)));

        // System.out.println(s1.length());
        // System.out.println(Integer.parseInt(s1));
        // System.out.println(Character.getNumericValue(s1.charAt(0)));
        // System.out.println(Integer.parseInt(s1.charAt(0)));
        // String Str = new String("Welcome to Tutorialspoint.com");
        // String SubStr1 = new String("Tutorials");
        // System.out.print("Found Index :");
        // System.out.println(Str.indexOf(SubStr1, 0));
    }

}