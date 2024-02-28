package strategy.carrinho;

public class TenOff implements DiscountStrategy{

    @Override
    public double applyDiscount(double total) {
        return total * 0.9;
    }
    

}
