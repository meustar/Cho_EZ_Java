public class String01 {
    public static void main(String[] args) {

        // 문자열 글자 수 세기

        String characterName = "해치지마요";
        int length = characterName.length();
        System.out.println("글자수: " + length);

        // 문자열 일부 바꾸기

        String fat = "치킨은 살 안쪄요. 살은 내가 쪄요.";
        String replaced = fat.replaceAll("내가", "니가");
        System.out.println(replaced);

        // 문자열 자르기

        String birthday = "1991/08/29";
        String year = birthday.substring(0, 4);
        String day = birthday.substring(8);
        String month = birthday.substring(5, 7);
        System.out.println("출생년도: " + year);
        System.out.println("출생월: " + month);
        System.out.println("출생일: " + day);
    }
}
