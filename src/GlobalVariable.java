import java.util.Scanner;

public class GlobalVariable {

    public  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        echoSomeInputs();


    }

    public static void echoSomeInputs(){
        // Scanner scanner = new Scanner(System.in);
        echoInteger();
        echoString();
    }

    public static void echoInteger() {
        // Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
    }

    public  static void  echoString() {
        // Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
