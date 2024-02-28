package strategy.carrinho;

import java.util.Scanner;

public class CarrinhoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DiscountStrategy freeShipping = new FreeShipping();
        DiscountStrategy tenOff = new TenOff();

        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.println("Nome do produto adicionado: ");
        String nomeProduto = scanner.nextLine();
        System.out.println("Preço do produto: ");
        Double precoProduto = scanner.nextDouble();
        shoppingCart.addproduto(precoProduto);

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                shoppingCart.setDisconto(tenOff);
                break;
            case 2:
                shoppingCart.setDisconto(freeShipping);
                break;
            default:
            System.out.println("Opção inválida. nenhum desconto aplicado.");
                break;
        }

        double total = shoppingCart.calcularTotal(precoProduto);
        System.out.println("Nome do produto: " + nomeProduto + "Total da compra: " + total);

        scanner.close();


    }
}
