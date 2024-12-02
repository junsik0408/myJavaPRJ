import java.util.Scanner;

public class Code_0076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("학생의 점수를 입력하세요 (0 ~ 100): ");
        int score = scanner.nextInt();

        // 성적 계산
        if (score >= 90) {
            System.out.println("성적: A");
            if (score >= 95) {
                System.out.println("축하합니다! 최우수 성적입니다.");
            }
        } else if (score >= 80) {
            System.out.println("성적: B");
            if (score >= 85) {
                System.out.println("매우 좋습니다! 조금만 더 노력하면 A를 받을 수 있습니다.");
            }
        } else if (score >= 70) {
            System.out.println("성적: C");
            if (score >= 75) {
                System.out.println("잘 하고 있습니다! 조금 더 노력하면 B를 받을 수 있습니다.");
            }
        } else if (score >= 60) {
            System.out.println("성적: D");
            if (score >= 65) {
                System.out.println("조금 더 노력해서 C로 올려보세요!");
            }
        } else {
            System.out.println("성적: F");
            System.out.println("공부에 더 많은 시간을 투자해야 합니다.");
        }

        // 점수에 따른 특수 메시지 출력
        if (score == 100) {
            System.out.println("완벽한 점수입니다! 정말 잘했어요!");
        } else if (score < 50) {
            System.out.println("조금 더 열심히 공부해보세요. 포기하지 마세요!");
        }

        scanner.close();
    }
}
