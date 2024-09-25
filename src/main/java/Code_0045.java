public class Code_0045 {
        public static void main(String[] args) {
            int[][] array = initializeArray(3, 3);

            // 배열 출력
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }

        // 2차원 배열을 초기화하는 메서드
        public static int[][] initializeArray(int rows, int cols) {
            int[][] array = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = i * cols + j;  // 값 초기화
                }
            }

            return array;
        }

}
