import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("강아지의 몸무게를 입력하세요.");
        String dogWeight = scanner.nextLine();
        try {
            double weight = Double.parseDouble(dogWeight);
            double amount = weight * 10;
            System.out.println("권장 급여량은 " + amount + "g입니다.");
        } catch (Exception e) {
            System.out.println("변환중 오류발생. 다시 실행해주세요.");
        }
    }
}
