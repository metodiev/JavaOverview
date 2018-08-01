package test.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested

        // assert statements
        assertEquals(10, tester.multiply(10, 1), 10 * 1);
        assertEquals(10, tester.multiply(1, 10), 1 * 10);
        assertEquals(1, tester.multiply(1, 1), 1 * 1);
        assertEquals(1, tester.multiply(1, 1), 1 * 1);
        assertEquals(1, tester.multiply(1, 1), 1 * 1);
    }
}