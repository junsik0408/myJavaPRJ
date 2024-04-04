import java.util.Scanner;

public class Code_Quiz { // 클래스 코드 퀴즈
    public static void main(String[] args) { // 함수생성
        Scanner s = new Scanner(System.in); // 값을 입력받는 스캐너
        System.out.print("값 입력"); // 사용자를 위한 입력창
        int a = s.nextInt(); // 입력정수값을 a에 대입

        if (a%21==0) { // 3과 7의 배수를 모두 만족하는 값 21
            System.out.println("3과7 모두 배수 모두 만족합니다."); // 조건 만족시 출력문구}

        }else if (a%3==0){//3의 배수를 만족하는 조건
            System.out.println("3의 배수입니다"); // 3의 배수일경우 출력

            }else if (a % 7 == 0){
                System.out.println("7의 배수입니다."); //7의 배수일경우,출력

            }else {
                System.out.println("이 숫자는 3의 배수도, 7의 배수도 아니네요."); // 그 외의 경우 출력됨.
            }

            s.close(); //스캐너를닫는다.
        }
    }