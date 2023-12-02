package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.servicee.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String info() {
        return calculatorService.info();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result = calculatorService.plus(num1, num2);
        return getResultMessage(num1, num2, '+', result);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result = calculatorService.minus(num1, num2);
        return getResultMessage(num1, num2, '-', result);
    }

    @GetMapping(path = "/multiply")
    public String muultiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result = calculatorService.multiply(num1, num2);
        return getResultMessage(num1, num2, '*', result);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num2 != 0) {
            Integer result = calculatorService.divide(num1, num2);
            return getResultMessage(num1, num2, '/', result);
        } else {
            return "Mistake";
        }
    }

    public String getResultMessage(Integer num1, Integer num2, char action, Integer result) {
        return String.format("<h2>%d %c %d = %d </h2>", num1, action, num2, result);
    }
}