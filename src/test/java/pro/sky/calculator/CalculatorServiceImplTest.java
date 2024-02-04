package pro.sky.calculator;


import org.junit.jupiter.api.Test;
import pro.sky.calculator.exceptions.NoArgumentException;
import pro.sky.calculator.exceptions.ZeroDivideException;
import pro.sky.calculator.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest{
    private final CalculatorServiceImpl e = new CalculatorServiceImpl();

    @Test
    public void methodPlusHasToReturn5WhenSum2And3() {
        assertEquals(5, e.plus(2, 3));
    }
    @Test
    public void methodPlusHasToReturn6WhenSum3And3() {
        assertEquals(6, e.plus(3, 3));
    }

    @Test
    public void methodHasToReturnNoArgumentExceptionWhenOneOfTheArgumentsIsNullWhenPlus() {
        assertThrows(NoArgumentException.class, () -> e.plus(null, 3));
    }

    @Test
    public void methodMinusHasToReturn2WhenMinus5And3() {
        assertEquals(2, e.minus(5, 3));
    }
    @Test
    public void methodMinusHasToReturn3WhenMinus5And2() {
        assertEquals(3, e.minus(5, 2));
    }
    @Test
    public void methodHasToReturnNoArgumentExceptionWhenOneOfTheArgumentsIsNullWhenMinus() {
        assertThrows(NoArgumentException.class, () -> e.minus(null, 3));
    }
    @Test
    public void methodMultiplyHasToReturn6WhenMultiply2And3() {
        assertEquals(6, e.multiply(2, 3));
    }
    @Test
    public void methodMultiplyHasToReturn9WhenMultiply3And3() {
        assertEquals(9, e.multiply(3, 3));
    }
    @Test
    public void methodHasToReturnNoArgumentExceptionWhenOneOfTheArgumentsIsNullWhenMultiply() {
        assertThrows(NoArgumentException.class, () -> e.multiply(null, 3));
    }
    @Test
    public void methodDivideHasToReturn3WhenDivide6And2() {
        assertEquals(3, e.divide(6, 2));
    }
    @Test
    public void methodDivideHasToReturn2WhenDivide6And3() {
        assertEquals(2, e.divide(6, 3));
    }
    @Test
    public void methodHasToReturnNoArgumentExceptionWhenOneOfTheArgumentsIsNullWhenDivide() {
        assertThrows(NoArgumentException.class, () -> e.divide(null, 3));
    }

    @Test
    public void methodDivideHasToReturnZeroDivideExceptionWhenDivideSmthOnZero() {
        assertThrows(ZeroDivideException.class, () -> e.divide(6, 0));
    }
}
