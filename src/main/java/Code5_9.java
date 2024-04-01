import java.util.Scanner;

public class Code5_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select;

        System.out.print("1~3 중에 선택하세요 : ");
        select = s.nextInt();

        switch (select) { // 입력된 select 값에 따라 분기
            case 1: // select가 1이면 12행을 실행하고 13행에서 빠져나감
                System.out.println("1을 선택했습니다.");
                break;

            case 2:
                System.out.println("2를 선택했습니다.");
                break;
            case 3:
                System.out.println("3을 선택했습니다.");
                break;
            default:    // select가 1,2,3,이 아닌 경우 실행
                System.out.println("이상한 것을 선택했습니다.");
        }

        s.close();
    }
 }
