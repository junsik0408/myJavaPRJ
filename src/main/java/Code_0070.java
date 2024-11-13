import java.util.Scanner;

public class Code_0070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("신용 점수를 입력하세요 (0-850): ");
        int creditScore = scanner.nextInt();

        System.out.print("대출 금액을 입력하세요 (만원 단위): ");
        int loanAmount = scanner.nextInt();

        double interestRate;

        if (creditScore >= 750) {
            interestRate = 3.0; // 신용 점수가 높으면 기본 금리 3%
        } else if (creditScore >= 650) {
            interestRate = 4.5; // 중간 금리
        } else {
            interestRate = 6.0; // 낮은 신용 점수일 경우 높은 금리
        }

        if (loanAmount >= 10000) {
            interestRate += 1.0; // 대출 금액이 많으면 추가 금리 적용
        } else if (loanAmount >= 5000) {
            interestRate += 0.5; // 중간 금리 추가
        }

        System.out.println("적용 금리: " + interestRate + "%");

        scanner.close();
    }
}
