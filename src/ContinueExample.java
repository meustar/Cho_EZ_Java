public class ContinueExample {
    public static void main(String[] args) {

        // for문과 Coutinue 사용하기

        /*for (int i = 0; i < 10; i ++){
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/


        // While문과 Continue 사용하기
        int i = 0;

        while (i < 10) {
            if (i % 2 == 0) {
                i++;            // while문의 무한루프에 빠지지 않게 꼭 증감연산자를 사용해줘야 한다.
                continue;
            }

            System.out.println(i);
            i++;                // while문의 무한루프에 빠지지 않게 꼭 증감연산자를 사용해줘야 한다.
        }
    }
}
