package CalculatorTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class CalculatorSteps {
    private Calculator calc;
    double a;
    double b;
    double result;

    @Given("^Две цифры (\\d) и (\\d)")
    public void given(double a, double b) {
        this.a = a;
        this.b = b;
        this.calc = new Calculator();
    }

    @Then("^Находим сумму двух чисел")
    public void result() {
        result = calc.plus(a, b);
    }

    @When("^Результат должен быть (\\d)")
    public void check(double res) {
        assertEquals(res, result, 0.0001);
        System.out.println("Результат суммы: "+result);
    }
}
