package adapter;
import java.util.Scanner;

public class AdapterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor que deseja converter: ");

        double input = Double.parseDouble(scanner.nextLine());

        OldCurrencyConverter oldConverter = new OldCurrencyConverter();
        AdaptedConverter adaptador = new AdaptedConverter(oldConverter);

        double usdToEur = adaptador.ConvertUSDtoEUR(input);

        System.out.println("USD: " + input);
        System.out.println("EUR: " + usdToEur);

        scanner.close();
    }
}
