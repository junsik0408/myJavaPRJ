import java.util.Scanner;

public class Code_0055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2차원 배열 선언 (2행 3열)
        int[][] array = new int[2][3];

        // 사용자로부터 입력받기
        System.out.println("2x3 배열에 값을 입력하세요:");
        for (int i = 0; i < array.length; i++) {  // 행 반복
            for (int j = 0; j < array[i].length; j++) {  // 열 반복
                System.out.print("array[" + i + "][" + j + "] 값 입력: ");
                array[i][j] = scanner.nextInt();  // 값 입력
            }
        }

        // 입력받은 배열 출력
        System.out.println("입력된 배열:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // 한 행이 끝나면 줄바꿈
        }

        scanner.close();
    }
}
