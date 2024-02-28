package observer;

public class User implements Observer{

    private String nome;

    public User(String nome){
        this.nome= nome;
    }

    @Override
    public void update(String nomeProduto) {
        System.out.println("Notificação recebida pelo usuario: " + nome + "Produto adicionado - " + nomeProduto);
    }

}
