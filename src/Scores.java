import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {

        String[] subjects = {"국어", "영어", "수학", "과학"};
        int[] scores = {90, 75, 30, 40};

        Scanner scanner = new Scanner(System.in);
        System.out.println("확인하고 싶은 과목명을 입력하세요. (국어, 영어, 수학, 과학)");
        String inputSubjects = scanner.nextLine();

        for (int i = 0; i < subjects.length; i++) {
            String subject = subjects[i];

            if (subject.equals(inputSubjects)) {
                System.out.println(
                        inputSubjects + " 점수는 " + scores[i] + "점 입니다."
                );
            }
        }
    }
}
