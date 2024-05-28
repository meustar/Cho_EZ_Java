import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // List를 선언하는 여러가지 방법.
        /*List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<>();*/

        List<String> list = new ArrayList<>();
        // list에 데이터 추가/제거하기
        list.add("파");
        list.add("피자");
        list.add("치킨");

        // 직접 값을 넣어서 제거
        //list.remove("치킨");

        // 인덱스를 넣어서 제거
        //list.remove(0);

        // 특정 위치의 값을 변경하기 위한 방밥 set(인덱스, 값)
        //list.set(0, "치킨");


        // list 데이터 가져오기
        String foods = list.get(0);

        System.out.println(foods);
    }
}
