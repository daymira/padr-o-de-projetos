package strategy.calculadora;

public class SubOperation implements Operation{

    @Override
    public double execute(double num1, double num2) {
        return num1 - num2;
    }

}
