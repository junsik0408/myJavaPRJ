import java.util.Scanner;

public class Code_0068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCredits = 0;
        double totalPoints = 0.0;
        boolean scholarshipEligible = true;

        for (int i = 1; i <= 3; i++) {
            System.out.print("과목 " + i + "의 점수를 입력하세요: ");
            int score = scanner.nextInt();

            int credits;
            double gradePoints;

            if (score >= 90) {
                credits = 3;
                gradePoints = 4.0;
            } else if (score >= 80) {
                credits = 3;
                gradePoints = 3.5;
            } else if (score >= 70) {
                credits = 3;
                gradePoints = 3.0;
            } else if (score >= 60) {
                credits = 3;
                gradePoints = 2.0;
                scholarshipEligible = false; // 60점 이하 과목은 장학금 대상 제외
            } else {
                credits = 3;
                gradePoints = 0.0;
                scholarshipEligible = false; // 낙제 과목이 있으면 장학금 불가
            }

            totalCredits += credits;
            totalPoints += (gradePoints * credits);
        }

        double gpa = totalPoints / totalCredits;

        System.out.println("총 학점 평균: " + gpa);
        if (gpa >= 3.0 && scholarshipEligible) {
            System.out.println("장학금 대상입니다.");
        } else {
            System.out.println("장학금 대상이 아닙니다.");
        }

        scanner.close();
    }
}
