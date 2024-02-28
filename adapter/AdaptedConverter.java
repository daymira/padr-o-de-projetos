package adapter;

class AdaptedConverter {
    private final OldCurrencyConverter oldConverter;

    public AdaptedConverter(OldCurrencyConverter oldConverter){
        this.oldConverter = oldConverter;
    }

    //retornar nova conversão de us para outra moeda.

    public double ConvertUSDtoEUR(double amount){
        double usdToEur = oldConverter.convertUSDtoGBP(amount);
        return usdToEur * 1.0625;
    }
}
