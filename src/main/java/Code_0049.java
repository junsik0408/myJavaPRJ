import java.util.Scanner;

public class Code_0049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();
        int price;

        // 나이별 요금 계산
        if (age < 5) {
            price = 0;
        } else if (age <= 12) {
            price = 500;
        } else if (age <= 64) {
            price = 1000;
        } else {
            price = 700;
        }

        System.out.println("요금은 " + price + "원입니다.");
        scanner.close();
    }
}
