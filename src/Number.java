public class Number {
    public static void main(String[] args) {
        // 정수

        byte byteInteger = 10;
        short shortInteger = 20;
        int intInteger = 30;
        long longInteger = 40;

        System.out.println(byteInteger);
        System.out.println(shortInteger);
        System.out.println(intInteger);
        System.out.println(longInteger);

        System.out.println("-------------------------------");

        int sum = byteInteger + shortInteger;
        int sum2 = shortInteger + intInteger;

        long sum3 = intInteger + longInteger;
        long sum4 = byteInteger + longInteger;

        System.out.println("-------------------------------");

        short shortNum = 5;
        int intNum = 10;
        long longNum = 20;

        int intResult = intNum - shortNum;
        long longResult = longNum - intNum;

        System.out.println(intResult);
        System.out.println(longResult);

        System.out.println("-------------------------------");

        // 실수

        float floatNumber = 0.1f;
        double doubleNumber = 0.2;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        float floatSum = 0.001f + 0.001f + 0.0001f;
        System.out.println(floatSum);

    }
}
