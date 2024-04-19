public class Code_Exam_0000 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 1 + 2 * i; k++)
                System.out.print("*");
            System.out.println();
        }

    }
}

