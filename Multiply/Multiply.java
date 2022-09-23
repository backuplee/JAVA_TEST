package Multiply;

public class Multiply {
    public static Double multiply(Double a, Double b) {
        if (a == null || b == null)
            throw new IllegalArgumentException("Arguments must not be null");
        return a * b;
    }
}
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
// TODO: Replace examples and use TDD by writing your own tests

// public class SolutionTest {
// @Test
// public void testSomething() {
// assertEquals("expected", "actual");
// }
// }
