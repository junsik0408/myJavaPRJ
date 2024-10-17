import java.util.Scanner;

public class Code_0058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 점수 입력 받기
        System.out.print("점수를 입력하세요 (0 ~ 100): ");
        int score = scanner.nextInt();

        // 학점 계산 및 장학금 여부 결정
        char grade;
        boolean scholarship = false;  // 장학금 여부
        boolean pass = false;  // 과목 통과 여부

        // 점수에 따른 학점 결정 및 장학금, 통과 여부 설정
        if (score >= 90) {
            grade = 'A';
            scholarship = true;
            pass = true;
        } else if (score >= 80) {
            grade = 'B';
            scholarship = true;
            pass = true;
        } else if (score >= 70) {
            grade = 'C';
            pass = true;
        } else if (score >= 60) {
            grade = 'D';
            pass = true;
        } else {
            grade = 'F';
        }

        // 결과 출력
        System.out.println("학점: " + grade);

        if (pass) {
            System.out.println("과목 통과: 예");
        } else {
            System.out.println("과목 통과: 아니오");
            System.out.println("재수강이 필요합니다.");
        }

        if (scholarship) {
            System.out.println("장학금 대상입니다!");
        } else if (pass && grade == 'C') {
            System.out.println("장학금 대상이 아닙니다. 더 높은 성적을 받으세요.");
        }

        // 특수 조건: 학점이 F일 경우 추가 설명 제공
        if (grade == 'F') {
            System.out.println("학점 F: 과목을 다시 들어야 합니다.");
        }

        // 특수 보너스: 만점일 경우 특별 메시지
        if (score == 100) {
            System.out.println("축하합니다! 만점을 받으셨습니다!");
        }

        scanner.close();  // 스캐너 자원 해제
    }
}
