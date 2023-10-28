import org.example.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator=new Calculator();
        int result=calculator.add(3,4);

        assertEquals(7,result);

    }
    @Test
    public void testSubtract(){
        Calculator calculator=new Calculator();
        int result=calculator.subtract(3,4);

        assertEquals(-1,result);

    }
    @Test
    public void testMultiply(){
        Calculator calculator=new Calculator();
        int result=calculator.multiply(3,4);

        assertEquals(12,result);

    }
    @Test
    public void testdivide(){
        Calculator calculator=new Calculator();
        int result=calculator.divide(8,4);

        assertEquals(2,result);

    }
    @Test(expected = ArithmeticException.class)
    public void testdivideByZero(){
        Calculator calculator=new Calculator();
        int result=calculator.divide(8,0);

        assertEquals(2,result);
    }


}
