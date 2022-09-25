package MaxDiffLength;

class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        // your code
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        } else {
            int max1 = 0, max2 = 0, min1 = a1[0].length(), min2 = a2[0].length(), temp1 = 0, temp2 = 0;
            for (int i = 0; i < a1.length; i++) {
                temp1 = a1[i].length();
                max1 = Math.max(max1, temp1);
                min1 = Math.min(min1, temp1);
            }
            for (int i = 0; i < a2.length; i++) {
                temp2 = a2[i].length();
                max2 = Math.max(max2, temp2);
                min2 = Math.min(min2, temp2);
            }
            return Math.max((max1 - min2), (max2 - min1));
        }
    }
}