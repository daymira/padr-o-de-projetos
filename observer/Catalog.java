package observer;
import java.util.List;
import java.util.ArrayList;

public class Catalog implements CatalogObservable{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String nomeProduto) {
        for(Observer observer: observers){
            observer.update(nomeProduto);
        }
    }

    public void addProduto (String nome, String descricao, double preco){
        notifyObservers(nome);
    }

}
