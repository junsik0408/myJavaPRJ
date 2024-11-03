import java.util.Scanner;

public class Code_0066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hourlyWage = 10.0; // 시간당 임금
        int standardHours = 40; // 기본 근무 시간

        System.out.print("이번 주 근무 시간을 입력하세요: ");
        int hoursWorked = scanner.nextInt();

        if (hoursWorked > standardHours) {
            int overtimeHours = hoursWorked - standardHours;
            double salary = (standardHours * hourlyWage) + (overtimeHours * hourlyWage * 1.5);
            System.out.println("이번 주 급여는 " + salary + "만원입니다.");
        } else if (hoursWorked == standardHours) {
            double salary = hoursWorked * hourlyWage;
            System.out.println("이번 주 급여는 " + salary + "만원입니다.");
        } else {
            System.out.println("근무 시간이 부족하여 급여는 " + (hoursWorked * hourlyWage) + "만원입니다.");
        }

        scanner.close();
    }
}
