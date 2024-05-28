public class WrapperTypes02 {
    public static void main(String[] args) {
        Integer integerNumber = 3;
        float floatNumber = integerNumber.floatValue();
        long longNumber = integerNumber.longValue();
        double doubleNumber = integerNumber.doubleValue();
        String stringNumber = integerNumber.toString();

        System.out.println(floatNumber);
        System.out.println(longNumber);
        System.out.println(doubleNumber);
        System.out.println(stringNumber);
    }
}
