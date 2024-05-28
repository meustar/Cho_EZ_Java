import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몸무게(kg)를 입력하세요.");
        double weight = scanner.nextDouble();

        System.out.println("신장(m)을 입력하세요.");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi <18.5) {
            System.out.println("귀하의 BMI는: " + bmi + " 저체중 입니다");
        } else if (bmi >= 23) {
            System.out.println("귀하의 BMI는: " + bmi + " 과체중 입니다.");
        } else {
            System.out.println("귀하의 BMI는: " + bmi + " 정상체중 입니다.");
        }

    }
}
