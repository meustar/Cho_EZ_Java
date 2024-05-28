import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String intString = scanner.nextLine();
        int number = Integer.parseInt(intString);
//        number = number + 1;
        System.out.println("입력한 숫자의 다음 숫자는 " + number + 1 + "입니다.");

        /*int intValue = Integer.parseInt(intString);
        System.out.println(intValue + 1);*/
    }
}
