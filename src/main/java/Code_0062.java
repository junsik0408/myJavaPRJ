import java.util.Scanner;

public class Code_0062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 키와 몸무게 입력 받기
        System.out.print("키(m)를 입력하세요: ");
        double height = scanner.nextDouble();

        System.out.print("몸무게(kg)를 입력하세요: ");
        double weight = scanner.nextDouble();

        // BMI 계산
        double bmi = weight / (height * height);
        System.out.printf("당신의 BMI는 %.2f입니다.\n", bmi);

        // BMI에 따른 분류
        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("정상 체중입니다.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("비만입니다.");
        }

        scanner.close();
    }
}
