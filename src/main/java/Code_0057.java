public class Code_0057 {
    public static void main(String[] args) {
        // 4행 4열의 2차원 배열 선언 및 초기화
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // 전치 행렬을 저장할 배열 선언 (4x4 크기 그대로)
        int[][] transpose = new int[array[0].length][array.length];

        // 전치 행렬 구하기
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        // 전치 행렬 출력
        System.out.println("전치 행렬:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
