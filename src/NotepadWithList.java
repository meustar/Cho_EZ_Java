import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotepadWithList {

    public static Scanner scanner = new Scanner(System.in);

    public static List<String> memoList = readMemoList();
    public static void main(String[] args) {
        while (true) {
            System.out.println("원하는 작업 번호를 입력해주세요");
            System.out.println("1. 메모읽기");
            System.out.println("2. 새 메모");
            System.out.println("3. 메모 목록");
            System.out.println("4. 종료");

            String operation = scanner.nextLine();
            int taskNum = parseIntegerOrNegative1(operation);

            if (taskNum == 1) {
                System.out.println("메모 파일명을 입력하세요.");

                String fileName = scanner.nextLine();

                readMemo(fileName);
            } else if (taskNum == 2) {
                System.out.println("저장할 메모 파일명을 입력하세요");

                String fileName = scanner.nextLine();
                writeMemo(fileName);
            } else if (taskNum == 3) {
                showMemoList();
            } else if (taskNum == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void readMemo(String fileName) {

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }


        System.out.println(fileName + "의 내용을 출력합니다.");

        Scanner reader = new Scanner(inputStream);

        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        System.out.println("\n");

        reader.close();
    }

    public static void writeMemo(String fileName) {
        if (memoList.contains(fileName)) {
            System.out.println("파일이 이미 존재합니다.");
            return;
        }

        FileWriter writer = null;

        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            return;
        }

        System.out.println("메모할 문자열을 입력하세요");
        System.out.println("(종료: 빈 줄에서 엔터키 입력)");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("프로그램 종료");
                break;
            }

            try {
                writer.write(input);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("파일에 문자열을 쓰지 못했습니다.");
            }
        }

        try {
            writer.close();
            memoList.add(fileName);
        } catch (IOException e) {
            System.out.println("파일을 닫는데 실패했습니다.");
        }
    }

    public static ArrayList<String> readMemoList() {
        FileInputStream inputStream = null;

        ArrayList<String> memoList = new ArrayList<>();

        try {
            inputStream = new FileInputStream("src/notes.txt");
        } catch (FileNotFoundException e) {
            return memoList;
        }

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNextLine()) {

            String fileName = scanner.nextLine();
            memoList.add(fileName);
        }

        return  memoList;

    }

    public static void showMemoList() {
        if (memoList.isEmpty()) {
            System.out.println("작성된 메모가 없습니다.");
        } else {
            System.out.println("메모 목록을 출력합니다.");

            for (String fileName : memoList) {
                System.out.println(fileName);
            }
            System.out.println("");
        }
    }

    public static void saveMemoList() {
        FileWriter writer = null;

        try {
            writer = new FileWriter("src/notes.txt");

            for (String fileName : memoList) {
                writer.write(fileName);
                writer.write("\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("메모 목록을 저장하는데 실패했습니다.");
        }
    }

    public static int parseIntegerOrNegative1(String input) {

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
