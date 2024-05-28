import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        // 배열의 요소에 접근하기

        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        /*System.out.println(days[0]);
        System.out.println(days[6]);*/


        // 배열의 길이 알아내기
        /*int lengthOfDays = days.length;
        System.out.println(lengthOfDays);*/

        // 배열을 반복문에 사용하기
        /*for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + "요일");
        }*/

        // 배열의 특정 요소 바꾸기
        /*days[0] = "일";
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + "요일");
        }*/

        // for-each문으로 적용해보기
        /*for (String day : days) {
            System.out.println(day + "요일");
        }*/

        // 배열 추가하기
        String[] days2 = Arrays.copyOf(days, 8);
        days2[7] = "일";

        for (String s : days2) {
            System.out.println(s);
        }



    }
}
