import java.util.Scanner;

public class Code_0065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        if (operator == '+') {
            System.out.println("결과: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("결과: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("결과: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("결과: " + (num1 / num2));
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
        }

        scanner.close();
    }
}
