import java.util.Scanner;

public class Code5_5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num;

        System.out.print("숫자 입력 ==>");
        num = S.nextInt();

        if (num%2 == 0)
            System.out.println("짝수입니다.");
        else
            System.out.println("홀수입니다.");

        S.close();
    }
}
