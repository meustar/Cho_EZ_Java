import java.util.Scanner;

public class FunctionExample {
    public static void main(String[] args) {

        // (1)
        System.out.println("함수를 만들어 봅시다.");

        sayHello();

        sayHelloTo("Chicken");

        chicken();

        // (5)
        printSum(3, 5);

        // (6)
        int result = sum(2, 4);

        System.out.println(result);

        // (7)
        int[] sumAndProduct = addAndMultiply(2, 3);
        System.out.println("sum: " + sumAndProduct[0]);
        System.out.println("product: " + sumAndProduct[1]);

        // (8)
        System.out.println("이름을 입력해주세요.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        sayHola(name);
    }

    // 메소드 정의와 메소드 호출(1)
    public static void sayHello() {
        System.out.println("Hello.");
    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }

    public static void chicken() {
        System.out.println("치킨은 살 안 쪄요.");
        System.out.println("살은 내가 쪄요.");
    }

    // 여러 개의 매개변수(5)
    public static void printSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        // System.out.println(a + " + " + b + " = " + sum(a, b));
    }

    // 반환값 return(6)
    // 두 정수를 더한 값 반환
    public static int sum(int a, int b) {
        return a + b;
    }

    // 여러 개의 반환값 - 배열이용 (7)
    // 두 정수를 더한 값과 곱한 값을 반환
    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};

        return result;
    }

    // return의 또다른 용도 (8)
    /*
    * 인사를 했다면 true를 반환하고
    * 그렇지 않다면 false를 반환한다.*/
    public static boolean sayHola(String name) {
        if(name.equals("바보")) {
            System.out.println("바르고 고운말을 사용해주세요.");
            return false;
        }//else {
            System.out.println(name + "님, 안녕하세요?");
            return true;
        //}
    }

}
