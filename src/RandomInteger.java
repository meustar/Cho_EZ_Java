import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        // 난수(random) 생성하기
        
        Random random = new Random();
        int randomNumber = random.nextInt(256);
        System.out.println(randomNumber);
    }
}
