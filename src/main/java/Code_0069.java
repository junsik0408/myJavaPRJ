import java.util.Scanner;

public class Code_0069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("날씨를 입력하세요 (맑음, 흐림, 비): ");
        String weather = scanner.next();

        System.out.print("현재 온도를 입력하세요: ");
        int temperature = scanner.nextInt();

        if (weather.equals("맑음") && temperature > 20) {
            System.out.println("외출하기 좋은 날입니다!");
        } else if (weather.equals("비") || temperature < 5) {
            System.out.println("외출하지 않는 것이 좋습니다.");
        } else {
            System.out.println("날씨와 온도를 고려하여 외출 여부를 결정하세요.");
        }

        scanner.close();
    }
}
