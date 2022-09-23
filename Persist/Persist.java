package Persist;

class Persist {
    public static int persistence(long n) {
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
        return count;
    }
}