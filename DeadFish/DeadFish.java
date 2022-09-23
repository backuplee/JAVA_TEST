package DeadFish;

class DeadFish {
    public static int[] parse(String data) {
        // Implement me! :)
        int k = 0, o = 0;
        // String s1 = "iiisdoso";
        // String s1 = "iiisdosodddddiso";
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'o') {
                count++;
            }
        }

        int[] f = new int[count];

        if (data.length() == 0) {
            System.out.println("error");
        } else {
            for (int i = 0; i < data.length(); i++) {
                if (data.charAt(i) == 'i') {
                    k += 1;
                } else if (data.charAt(i) == 's') {
                    k *= k;
                } else if (data.charAt(i) == 'd') {
                    k -= 1;
                } else if (data.charAt(i) == 'o') {
                    f[o] = k;
                    o += 1;
                } else {
                    System.out.println("error");
                }
            }
        }
        return f;
    }
}