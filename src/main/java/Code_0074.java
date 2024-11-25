import java.util.Scanner;

public class Code_0074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("현재 온도(섭씨)를 입력하세요: ");
        int temperature = scanner.nextInt();

        System.out.print("날씨 상태(맑음, 흐림, 비, 눈 중 하나 입력): ");
        String weather = scanner.next();

        if (temperature > 30) {
            if (weather.equals("맑음")) {
                System.out.println("오늘은 해변에서 수영을 즐기기에 좋은 날입니다!");
            } else if (weather.equals("비")) {
                System.out.println("날씨가 더운 비 오는 날에는 실내 수영장을 추천드립니다.");
            } else {
                System.out.println("날씨가 흐리거나 눈이 올 때는 외출 시 주의하세요.");
            }
        } else if (temperature >= 20 && temperature <= 30) {
            if (weather.equals("맑음")) {
                System.out.println("기온이 쾌적하니 등산이나 산책을 즐기기에 좋은 날입니다.");
            } else if (weather.equals("흐림")) {
                System.out.println("흐린 날씨에는 독서를 즐기거나 영화를 보는 것도 좋습니다.");
            } else {
                System.out.println("비나 눈이 오는 날에는 외출을 삼가고 실내 활동을 추천합니다.");
            }
        } else if (temperature >= 10 && temperature < 20) {
            if (weather.equals("맑음")) {
                System.out.println("기온이 조금 쌀쌀하니 가볍게 옷을 챙기고 공원에서 산책을 즐겨보세요.");
            } else if (weather.equals("비")) {
                System.out.println("비가 오는 날에는 따뜻한 차와 함께 독서를 즐기세요.");
            } else if (weather.equals("눈")) {
                System.out.println("눈 오는 날에는 눈사람을 만들어 보는 것도 좋은 선택입니다.");
            } else {
                System.out.println("흐린 날씨에는 실내에서 요리나 보드 게임을 해보세요.");
            }
        } else {
            if (weather.equals("눈")) {
                System.out.println("날씨가 매우 추우니 따뜻하게 옷을 입고 스키나 스노우보드를 즐겨보세요.");
            } else {
                System.out.println("기온이 낮고 날씨가 나쁘다면 따뜻한 집에서 쉬는 것을 추천합니다.");
            }
        }

        scanner.close();
    }
}
