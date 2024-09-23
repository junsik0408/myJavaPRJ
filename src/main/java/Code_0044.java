public class Code_0044 {
    public static void main(String[] args) {
        // 2x3 크기의 배열을 초기화
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 배열 출력
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
