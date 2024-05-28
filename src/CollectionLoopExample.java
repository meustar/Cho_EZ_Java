import java.util.HashSet;
import java.util.Set;

public class CollectionLoopExample {
    public static void main(String[] args) {
        Set<String> foods = new HashSet<>();

        foods.add("치킨");
        foods.add("피자");
        foods.add("고구마말랭이");

        // for-each 문으로 목록들을 출력하기
        /*for (String food : foods) {
            System.out.println(food + " 맛있어요");
        }*/

        // size() 메소드로 목록의 갯수를 파악하는 방법 - (컬렉션의 크기를 확인하는 메소드)
        /*if (foods.size() == 0 ) {
            System.out.println("목록이 비어있습니다.");
        } else {
            System.out.println("총 " + foods.size() + "개의 음식 목록이 있습니다.");
        }*/

        // isEmpty() 메소드로 목록이 비어있는지 boolean 값으로 반환하기
        if (foods.isEmpty()) {
            System.out.println("목록이 비어있습니다.");
            System.out.println(foods.isEmpty());
        } else {
            System.out.println("총 " + foods.size() + "개의 음식 목록이 있습니다.");
            System.out.println(foods.isEmpty()); // 치킨 피자 고구마말랭이 3개의 목록이 들어있으므로 false
        }
    }
}
