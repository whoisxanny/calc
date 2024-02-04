package pro.sky.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exceptions.NoArgumentException;
import pro.sky.calculator.exceptions.ZeroDivideException;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String info() {
        return "Добро пожаловать в калькулятор";
    }
    public Integer plus(Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            return num1 + num2;
        }
        throw new NoArgumentException("Something went wrong");
    }
    public Integer minus(Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            return num1 - num2;
        }
        throw new NoArgumentException("Something went wrong");
    }
    public Integer multiply(Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            return num1 * num2;
        }
        throw new NoArgumentException("Something went wrong");
    }
    public Integer divide(Integer num1, Integer num2) {
        if (num1 != null && num2 != null && num2 != 0) {
            return num1 / num2;
        } else if (num2 == 0) {
            throw new ZeroDivideException();
        }
        throw new NoArgumentException();
    }

}
