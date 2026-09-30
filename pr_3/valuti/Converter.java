package pr_3.valuti;

public class Converter {

    public enum InnerConverter {
        USD(1.0),
        RUB(92.5),
        JPY(157.39);
    
        private final double rateToUsd;

        InnerConverter(double rateToUsd) {
            this.rateToUsd = rateToUsd;  
        }

        public double getRateToUsd() {
            return rateToUsd;
        }
    }

    public double convert(double a, InnerConverter from, InnerConverter to) {
        double aInUsd = a / from.getRateToUsd();
        return aInUsd * to.getRateToUsd();
    }
    public static void main(String[] args) {
        Converter converter = new Converter();

        double result = converter.convert(1000, InnerConverter.RUB, InnerConverter.USD);
        System.out.printf("1000 RUB = %.2f USD%n", result);

        result = converter.convert(100, InnerConverter.USD, InnerConverter.JPY);
        System.out.printf("100 USD = %.2f JPY%n", result);

        result = converter.convert(50, InnerConverter.JPY, InnerConverter.RUB);
        System.out.printf("50 JPY = %.2f RUB%n", result);
    }
    
}
