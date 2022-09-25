package DeadFish;

// import java.lang.Math;

public class DeadFishTemp {
    public static void main(String[] args) {
        int k = 0, o = 0;
        // String s1 = "iiisdoso";
        String s1 = "iiisdosodddddiso";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'o') {
                count++;
            }
        }

        int[] f = new int[count];

        if (s1.length() == 0) {
            System.out.println("error");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == 'i') {
                    k += 1;
                } else if (s1.charAt(i) == 's') {
                    k *= k;
                } else if (s1.charAt(i) == 'd') {
                    k -= 1;
                } else if (s1.charAt(i) == 'o') {
                    f[o] = k;
                    System.out.println(f[o]);
                    o += 1;
                } else {
                    System.out.println("error");
                }
            }
        }
        // System.out.println(Character.getNumericValue('i'));
        // System.out.println(min1);
        // System.out.println(max2);
        // System.out.println(min2);
        // System.out.println(Math.max((max1 - min2), (max2 - min1)));

    }
    // System.out.println(s1.length());
    // System.out.println(Integer.parseInt(s1));
    // System.out.println(Character.getNumericValue(s1.charAt(0)));
    // System.out.println(Integer.parseInt(s1.charAt(0)));
    // String Str = new String("Welcome to Tutorialspoint.com");
    // String SubStr1 = new String("Tutorials");
    // System.out.print("Found Index :");
    // System.out.println(Str.indexOf(SubStr1, 0));
}
