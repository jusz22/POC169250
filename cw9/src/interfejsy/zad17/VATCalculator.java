package interfejsy.zad17;

public interface VATCalculator {
    double VATRate = .23;
    static double calculateAfterVAT(double price){
        return price + (price * VATRate);
    }
}
