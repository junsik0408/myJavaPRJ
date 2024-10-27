import java.util.Scanner;

public class Code_0063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 학습 시간 입력 받기
        System.out.print("오늘 학습한 시간을 입력하세요 (시간 단위): ");
        double studyHours = scanner.nextDouble();

        // 학습 시간에 따른 결과 출력
        if (studyHours >= 8) {
            System.out.println("훌륭합니다! 충분한 학습을 완료했습니다.");
        } else if (studyHours >= 5) {
            System.out.println("좋아요! 하지만 조금 더 학습하면 더 좋을 것 같아요.");
        } else if (studyHours > 0) {
            System.out.println("오늘 학습 시간이 부족합니다. 내일은 더 열심히 학습해보세요.");
        } else {
            System.out.println("유효하지 않은 시간을 입력했습니다.");
        }

        scanner.close();
    }
}
