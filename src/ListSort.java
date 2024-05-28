import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        // list 정렬하기

        List<String> students = new ArrayList<>();
        students.add("장민호");
        students.add("이찬원");
        students.add("정동원");
        students.add("임영웅");

        // 1. sort (오름차순 정렬)
        Collections.sort(students);

        // 2. reverse (현재 목록을 거꾸로 뒤집기- 내림차순으로 정렬시, sort 사용 후 reverse 사용해야함)
        Collections.reverse(students);

        System.out.println(students);



    }
}
