package Persist;

// import java.lang.Math;

public class Temp {
    public static void main(String[] args) {
        long n = 4;
        // your code
        int count = 0;
        while (n >= 10) {
            int k = 1;
            String s1 = String.valueOf(n);
            for (int i = 0; i < s1.length(); i++) {
                k *= Character.getNumericValue(s1.charAt(i));
            }
            System.out.println(k);
            n = k;
            count += 1;
        }
        System.out.println(count);
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