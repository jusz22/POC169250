package w162.math.logarithm;

public class LogarithmCalculatorTest {
    public static void main(String[] args) {
        SimpleLogarithmCalculator simpleLogarithmCalculator = new SimpleLogarithmCalculator();
        System.out.println(simpleLogarithmCalculator.calculateLog(12));
        System.out.println(simpleLogarithmCalculator.isGreaterThanOne(1));
        System.out.println(simpleLogarithmCalculator.isGreaterThanOne(2));
    }
}
