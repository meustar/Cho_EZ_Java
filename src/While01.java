import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {

        // While 기초 예제
        /*int i = 0;
        while (i < 10) {
            System.out.println("현재 반복 횟수: " + i);
            i++;
        }*/

        // 비밀번호가 맞을때까지 반복적으로 묻는 프로그램

        /*String password = "k2qjal12!@";
        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀번호를 입력해주세요.");
        String input = scanner.nextLine();

        while (input.equals(password) != true) {
            System.out.println("비밀번호를 다시 입력해주세요.");
            input = scanner.nextLine();
        }

        System.out.println("비밀번호가 확인되었습니다. 감사합니다.");*/

        // 비밀번호 프로그램에 do- while 문으로 변경

        /*String password = "k2qjal12!@";
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("비밀번호를 입력해주세요.");
            input = scanner.nextLine();
        } while (input.equals(password) != true);

        System.out.println("비밀번호가 확인되었습니다. 감사합니다.");*/


        // break 사용하기

        String password = "k2qjal12!@";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("비밀번호를 입력해주세요.");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("비밀번호가 일치합니다.");
                break;
            }

            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }
}
