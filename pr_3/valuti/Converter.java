package pr_3.valuti;

import java.text.NumberFormat;
import java.util.Locale;

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

    public static String formatCurrency(double amount, InnerConverter currency) {
        Locale locale;

        switch (currency) {
            case USD:
                locale = Locale.US;
                break;
            case RUB:
                locale = new Locale("ru", "RU");
                break;
            case JPY:
                locale = Locale.JAPAN;
                break;
            default:
                locale = Locale.US;
        }

        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return formatter.format(amount);
    }

    public static void main(String[] args) {
        Converter converter = new Converter();

        double result = converter.convert(1000, InnerConverter.RUB, InnerConverter.USD);
        System.out.println(formatCurrency(1000, InnerConverter.RUB)
                + " = " + formatCurrency(result, InnerConverter.USD));

        result = converter.convert(100, InnerConverter.USD, InnerConverter.JPY);
        System.out.println(formatCurrency(100, InnerConverter.USD)
                + " = " + formatCurrency(result, InnerConverter.JPY));

        result = converter.convert(50, InnerConverter.JPY, InnerConverter.RUB);
        System.out.println(formatCurrency(50, InnerConverter.JPY)
                + " = " + formatCurrency(result, InnerConverter.RUB));
    }
}