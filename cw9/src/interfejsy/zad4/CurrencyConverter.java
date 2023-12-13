package interfejsy.zad4;

public class CurrencyConverter implements Converter{
    @Override
    public double convertToEuro(double amount) {
        return 3.56 * amount;
    }

    @Override
    public double convertToUSD(double amount) {
        return 4.11 * amount;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency.equalsIgnoreCase("euro"))
            return 3.56;
        else if (currency.equalsIgnoreCase("usd"))
            return 4.11;
        else
            return 0;

    }
}
