public class Code_0054 {
    public static void main(String[] args) {
        // 3행 4열의 2차원 배열 선언 및 초기화
        int[][] array = {
                {1, 2, 3, 4},  // 1행
                {5, 6, 7, 8},  // 2행
                {9, 10, 11, 12}  // 3행
        };

        // 배열의 값 출력
        for (int i = 0; i < array.length; i++) {  // 행 반복
            for (int j = 0; j < array[i].length; j++) {  // 열 반복
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // 한 행 출력 후 줄바꿈
        }
    }
}