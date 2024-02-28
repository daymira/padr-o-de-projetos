package strategy.carrinho;

public class FreeShipping implements DiscountStrategy{

    @Override
    public double applyDiscount(double total) {
        System.out.println("Frete grátis aplicado.");
        return total;
    }

}
