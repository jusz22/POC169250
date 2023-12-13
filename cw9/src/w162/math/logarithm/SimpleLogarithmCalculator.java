package w162.math.logarithm;

public class SimpleLogarithmCalculator implements LogarithmCalculator{
    @Override
    public double calculateLog(int number) {
        return Math.log(number);
    }

    @Override
    public boolean isGreaterThanOne(double number) {
        return number > 1;
    }
}
