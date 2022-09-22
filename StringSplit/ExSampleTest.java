package StringSplit;

// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
// import org.junit.runners.JUnit4;
import java.util.Arrays;

// Replace examples and use TDD development by writing your own tests

public class ExSampleTest {
    public static void main(String[] args) {

        // public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        // Arrays.toString(StringSplit1.solution(s));
        System.out.println(Arrays.toString(StringSplit1.solution(s)));
        System.out.println(Arrays.toString(StringSplit1.solution(s1)));
        // assertEquals("Should handle even string", "[ab, cd, ef]",
        // Arrays.toString(StringSplit.solution(s)));
        // assertEquals("Should handle even string", "[He, ll, oW, or, ld]",
        // Arrays.toString(StringSplit.solution(s1)));
        // }

        // public void testOddString() {
        String s2 = "abcde";
        String s3 = "LovePizza";
        // assertEquals("Should handle odd string", "[ab, cd, e_]",
        // Arrays.toString(StringSplit.solution(s2)));
        // assertEquals("Should handle odd string", "[Lo, ve, Pi, zz, a_]",
        // Arrays.toString(StringSplit.solution(s3)));
        // }
        System.out.println(Arrays.toString(StringSplit1.solution(s2)));
        System.out.println(Arrays.toString(StringSplit1.solution(s3)));
    }
}

class StringSplit1 {
    /**
     * @param s
     * @return
     */

    public static String[] solution(String s) {
        // Write your code here
        // if it's blank, then return
        // if (s.length() == 0) {
        // return new String[];
        // }

        // if not even, then add an underscore to the end

        if (s.length() % 2 != 0) {
            s += "_";
        }

        // determine the space needed for the return array
        int spaceNeeded = s.length() / 2;
        // System.out.println(spaceNeeded);
        // create a new array to populate and return
        String[] out = new String[spaceNeeded];

        // create an builder index
        int j = 0;

        // loop through the input string
        for (int i = 0; i < s.length(); i++) {

            // create a new string to build
            StringBuilder sb = new StringBuilder();
            // add the current item
            // System.out.println(s.charAt(i));
            sb.append(s.charAt(i));
            // add the next item
            sb.append(s.charAt(i + 1));
            // System.out.println(s.charAt(i + 1));
            // populate our output string as we go
            out[j] = sb.toString();
            // System.out.println(out[j]);
            // increment both counters
            i++;
            j++;
        }

        // return the built string
        return out;
    }
}
