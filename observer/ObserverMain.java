package observer;

import java.util.Scanner;

public class ObserverMain {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        User user = new User("Usuario1");

        Scanner scan = new Scanner(System.in);

        catalog.addObserver(user);

        System.out.println("Nome do produto: ");
        String nome = scan.nextLine();
        System.out.println("Descrição do produto: ");
        String descricao = scan.nextLine();
        System.out.println("Preço do produto: ");
        double preco = scan.nextDouble();

        String escolha = scan.nextLine();
        if(escolha.equalsIgnoreCase("s")){
            catalog.addProduto(nome, descricao, preco);
        }else{
            System.out.println("Programa encerrado.");
        }

        scan.close();

    }

}
