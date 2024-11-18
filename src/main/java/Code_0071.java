import java.util.Scanner;

public class Code_0071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력하세요 (1~12): ");
        int month = scanner.nextInt();

        System.out.print("요일을 입력하세요 (1: 월요일, ..., 7: 일요일): ");
        int dayOfWeek = scanner.nextInt();

        double baseRate = 100.0; // 기본 요금
        double finalRate = baseRate;

        if (month >= 6 && month <= 8) {
            finalRate *= 1.5; // 성수기 요금 1.5배
            if (dayOfWeek == 6 || dayOfWeek == 7) {
                finalRate *= 1.2; // 주말 요금 20% 추가
            }
        } else if (month == 12 || month == 1 || month == 2) {
            finalRate *= 0.8; // 비수기 요금 20% 할인
        }

        System.out.println("총 숙박 요금: $" + finalRate);

        scanner.close();
    }
}
