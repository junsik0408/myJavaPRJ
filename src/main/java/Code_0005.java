public class Code_0005 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; j < 10; i++) { // for문 변수 2개로 지정 조건식 증감식을 다른 변수로 지정
            if (i == 10) { // i가 증감식으로 10
                i = 1; // 1로 초기화 , 증감식 2부터 시작
                System.out.println(); // i가 9까지 출력되고 증감식으로 10이 되므로 줄바꿈
                j++; // j를 증감 , for문 반복문 성립
            } else {
                System.out.print(i + "X" + j + "=" + i * j + "\t"); // i가 2~9 구구단 출력
            }
        }
    }
}