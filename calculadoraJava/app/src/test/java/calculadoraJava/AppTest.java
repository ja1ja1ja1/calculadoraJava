/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculadoraJava;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	@Test
    public void testAddition() {
        App classUnderTest = new App();
        assertEquals(10, classUnderTest.calculadora(5, 5, "+"));
    }

    @Test
    public void testSubtraction() {
        App classUnderTest = new App();
        assertEquals(3, classUnderTest.calculadora(8, 5, "-"));
    }

    @Test
    public void testMultiplication() {
        App classUnderTest = new App();
        assertEquals(27, classUnderTest.calculadora(3, 9, "*"));
    }

    @Test
    public void testInvalidOperator() {
        App classUnderTest = new App();
        assertEquals(0, classUnderTest.calculadora(10, 5, "x"));
    }

    @Test
    public void testZeroSubtraction() {
        App classUnderTest = new App();
        assertEquals(0, classUnderTest.calculadora(5, 5, "-"));
    }
}
