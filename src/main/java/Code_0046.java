public class Code_0046 {
    public static void main(String[] args) {
        // 가변 길이 배열 선언
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];  // 첫 번째 행에 2개의 열
        jaggedArray[1] = new int[3];  // 두 번째 행에 3개의 열
        jaggedArray[2] = new int[1];  // 세 번째 행에 1개의 열

        // 배열의 값 초기화
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[2][0] = 6;

        // 배열 출력
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
