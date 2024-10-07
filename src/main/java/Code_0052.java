public class Code_0052 {
    public static void main(String[] args) {
        int temperature = 25;
        boolean isRaining = false;

        if (temperature > 20 && !isRaining) {
            System.out.println("날씨가 좋습니다. 산책을 할 수 있습니다.");
        } else if (temperature > 20 && isRaining) {
            System.out.println("날씨는 좋지만 비가 오고 있습니다.");
        } else {
            System.out.println("날씨가 좋지 않습니다.");
        }
    }
}
