import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/acronym.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(inputStream);

        // 한줄 씩 읽어오는 방법. ( 초과로 줄을 읽게되면 오류발생 )
        /*String line = scanner.nextLine();
        System.out.println(line);
        String line2 = scanner.nextLine();
        System.out.println(line2);*/

        // 초과로 인한 오류
        /*String line3 = scanner.nextLine();
        System.out.println(line3);*/

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
