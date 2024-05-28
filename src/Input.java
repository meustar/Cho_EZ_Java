import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // 한 줄 입력받기

        /*Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);*/

        // 띄어쓰기 단위로 입력받기

        System.out.println("영어 단어와 한글 단어를 하나씩 입력해보세요. ");
        Scanner scanner = new Scanner(System.in);

        String englishWord = scanner.next();
        String koreanWord = scanner.next();

        System.out.println("입력된 영단어: " + englishWord);
        System.out.println("입력된 한글 단어: " + koreanWord);
    }
}
