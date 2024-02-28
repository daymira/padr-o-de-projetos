package strategy.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculator calculadora = new Calculator();

        Operation addOperation = new AddOperation();
        Operation subOperation = new SubOperation();
        Operation mulOperation = new MultOperation();
        Operation divOperation = new DivOperation();

        System.out.println("1° número: ");
        double num1 = scan.nextDouble();
        System.out.println("2° número: ");
        double num2 = scan.nextDouble();

        System.out.println("Escolha uma operção(+, -, *, /): ");
        String sinal = scan.next();

        switch (sinal) {
            case "+":
                calculadora.setOperation(addOperation);
                break;
            case "-":
                calculadora.setOperation(subOperation);
                break;
            case "*":
                calculadora.setOperation(mulOperation);
                break;
            case "/":
                calculadora.setOperation(divOperation);
            default:
                break;
        }

        double result = calculadora.performOperation(num1, num2);
        System.err.println(result);

        scan.close();

    }
}
