package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.service.impl.CalculatorServiceImpl;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSrviceImplParamTest {
    private final CalculatorServiceImpl e = new CalculatorServiceImpl();

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(2, 3),
                Arguments.of(3,4),
                Arguments.of(4,2)
        );
    }

    @MethodSource("provideArguments")
    @ParameterizedTest
    public void methodHasToReturnCorrectSlojeniye(Integer num1, Integer num2) {
        assertEquals(num1 + num2, e.plus(num1, num2));
    }

    @MethodSource("provideArguments")
    @ParameterizedTest
    public void methodHasToReturnCorrectSubtraction(Integer num1, Integer num2) {
        assertEquals(num1 - num2, e.minus(num1, num2));
    }

    @MethodSource("provideArguments")
    @ParameterizedTest
    public void methodHasToReturnCorrectDivision(Integer num1, Integer num2) {
        assertEquals(num1 / num2, e.divide(num1, num2));
    }

    @MethodSource("provideArguments")
    @ParameterizedTest
    public void methodHasToReturnCorrectMultiplication(Integer num1, Integer num2) {
        assertEquals(num1 * num2, e.multiply(num1, num2));
    }


}
