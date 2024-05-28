import java.util.Scanner;

public class EggCartonCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("달걀의 갯수를 입력하세요");

        int eggCartonSize = 30;
        int totalEggs = 0;

        String input = scanner.nextLine();

        try {
            totalEggs = Integer.parseInt(input);

            if (totalEggs < 30) {
                System.out.println("계란판이 필요하지 않습니다.");
            } else {
                int totalEggCartons = totalEggs / eggCartonSize;
                System.out.println("총 " + totalEggCartons + "개의 계란판이 필요합니다." );
            }

        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
