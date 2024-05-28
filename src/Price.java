import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        System.out.println("메뉴 번호를 입력해주세요.");
        System.out.println("1. 치킨");
        System.out.println("2. 순대국");
        System.out.println("3. 한우 스테이크");

        Scanner scanner = new Scanner(System.in);
        int menuNumber;

        try {
            menuNumber = scanner.nextInt();
        } catch (Exception e) {
            menuNumber = -1;
        }


        switch (menuNumber) {
            case 1 :
                System.out.println("치킨은 15000원 입니다.");
                break;
            case 2 :
                System.out.println("순대국은 9천원 입니다.");
                break;
            case 3 :
                System.out.println("한우 스테이크는 38000원 입니다.");
                break;
            default:
                System.out.println("판매하지 않는 메뉴입니다.");
                break;
        }
    }
}
