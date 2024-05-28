import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CheckDuplicates {
    public static void main(String[] args) {
        System.out.println("좋아하는 음식의 이름을 입력하세요. (종료: 0)");

        ArrayList<String> myFavoriteFoods = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String food = scanner.nextLine();

            if (food.equals("0")) {
                break;
            }

            if (myFavoriteFoods.contains(food)) {
                System.out.println(food + "은(는) 이미 목록에 있습니다.");
            } else {
                myFavoriteFoods.add(food);
            }
        }

        Collections.sort(myFavoriteFoods);

        System.out.println(myFavoriteFoods);
    }
}
