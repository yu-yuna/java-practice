public class DoubleEx {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.71");
        Double d3 = Double.valueOf(10);

        System.out.println("Создали: ");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3 + '\n');

        System.out.println("Преобразовали Str: ");
        String str = "3.14159";
        double parsed = Double.parseDouble(str);
        System.out.println("parsed = " + parsed + '\n');

        System.out.println("Преобразовали Double: ");
        Double obj = Double.valueOf(65.14);

        double pDouble = obj.doubleValue();
        float pFloat = obj.floatValue();
        long pLong = obj.longValue();
        int pInt = obj.intValue();
        short pShort = obj.shortValue();
        byte pByte = obj.byteValue();
        char pChar = (char) obj.doubleValue();

        System.out.println("doubleValue() = " + pDouble);
        System.out.println("floatValue() = " + pFloat);
        System.out.println("longValue() = " + pLong);
        System.out.println("intValue() = " + pInt);
        System.out.println("shortValue() = " + pShort);
        System.out.println("byteValue() = " + pByte);
        System.out.println("(char) doubleValue() = " + pChar + '\n');

        System.out.println("Вывели: ");
        System.out.println("Double: " + obj+ '\n');

        System.out.println("toString: ");
        String d = Double.toString(3.14);
        System.out.println("String d = " + d+ '\n');
    }
}