public class StringExample {
    public static void main(String[] args) {
        String chicken = "치킨은 살 안 쪄요.";
        String me = "살은 내가 쪄요.";

        System.out.println(chicken);
        System.out.println(me);



        // 문자열끼리 더하기.
        String chickenAndMe = chicken + me;
        System.out.println(chickenAndMe);

        // 문자열의 길이 구하기
        System.out.println(me.length());

        // 문자열의 길이를 변수에 넣어서 출력해보자.
        int length = chicken.length();
        System.out.println(length);

        // 문자열 바꾸기
        String replaced = me.replaceAll("내가", "치킨이");
        System.out.println(replaced);

        // 문자열 자르기
        String birthday = "1970/01/01";
        String year = birthday.substring(0, 4);         // 시작 위치 부터~ 끝위치 "전"까지
        String day = birthday.substring(8);   // 시작위치 부터~ 문자열 맨 끝까지
        System.out.println(year);
        System.out.println(day);
    }
}
