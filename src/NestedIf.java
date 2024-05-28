public class NestedIf {
    public static void main(String[] args) {
        // 두 조건을 동시에 만족할 때
        // 중첩 if문

        /*int age = 5;

        if(age >= 10) {
            if (age < 20) {
                System.out.println("10대");
            } else {
                System.out.println("10대 아님");
            }
        } else {
            System.out.println("10대 아님");
        }*/


        // 논리연산자를 통해 하나의 if문 안에 여러 조건을 명시하는 방법

        /*int age = 15;

        if (age >= 10 && age < 20) {
            System.out.println("10대");
        } else {
            System.out.println("10대 아님");
        }*/


        /*System.out.println(false && false); //F
        System.out.println(false && true);  //F
        System.out.println(true && false);  //F
        System.out.println(true && true);   //T
        // 모두 true일 때만 true가 출력됨.*/


        // 두 조건 중 일부만 만족해도 실행하기

        /*int age = 5;

        if (age < 10 || age >= 20) {
            System.out.println("10대 아님");
        } else {
            System.out.println("10대");
        }*/

        System.out.println(false || false); //F
        System.out.println(false || true);  //T
        System.out.println(true || false);  //T
        System.out.println(true || true);   //T
        // 둘중 하나라도 True일 경우 True가 출력됨
    }
}
