package strategy.carrinho;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;
    private List<Double> products = new ArrayList<>();

    public void addproduto(double preco){
        products.add(preco);
    }

    public void setDisconto(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double calcularTotal(double total){
        return discountStrategy.applyDiscount(total);
    }


}
