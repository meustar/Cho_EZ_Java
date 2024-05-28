import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력하세요.");
        String firstNumber = scanner.nextLine();
        System.out.println("두 번째 수를 입력하세요.");
        String secondNumber = scanner.nextLine();

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;
        System.out.println("두 수를 더한 값은: " + sum + "입니다.");

    }
}
