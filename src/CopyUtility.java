import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("복사할 파일명을 입력하세요.");
        String sourceFileName = scanner.nextLine();

        System.out.println("저장할 파일명을 입력하세요.");
        String destinationFileName = scanner.nextLine();

        FileInputStream inputStream = null;

        FileWriter writer = null;

        try {
            inputStream = new FileInputStream(sourceFileName);
        } catch (FileNotFoundException e) {
            System.out.println("존재하지 않는 파일입니다" + sourceFileName);
            System.exit(10);
        }

        try {
            writer = new FileWriter(destinationFileName);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패하였습니다." + destinationFileName);
            System.exit(11);
        }

        Scanner fileReader = new Scanner(inputStream);

        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();

            try {
                writer.write(line);
                writer.close();
            } catch (IOException e) {
                System.out.println("파일쓰기에 실패했습니다." + destinationFileName);
                System.exit(12);
            }
        }

        System.out.println("파일이 복사되었습니다.");
        System.out.println("원본파일: " + sourceFileName);
        System.out.println("복제파일: " + destinationFileName);

        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일을 닫는 중 오류가 발생했습니다.");
        }

    }
}
