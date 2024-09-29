import java.util.Scanner;

public class Code_0048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        // if-else 문
        if (number > 0) {
            System.out.println("입력한 숫자는 양수입니다.");
        } else if (number < 0) {
            System.out.println("입력한 숫자는 음수입니다.");
        } else {
            System.out.println("입력한 숫자는 0입니다.");
        }

        scanner.close();
    }
}
