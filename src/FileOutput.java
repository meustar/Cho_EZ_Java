import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {

        FileWriter writer = null;

        try {
            writer = new FileWriter("src/output01.txt", true);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            writer.write(input);
            writer.close();
        } catch (IOException e) {
            System.out.println("파일에 데이터를 쓰는 데에 실패했습니다.");
            System.exit(2);
        }
    }
}
