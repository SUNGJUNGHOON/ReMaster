import java.util.Scanner;

public class RacingLevel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 대수를 입력하세요.");
        int carCount = scanner.nextInt();
        System.out.println("시도할 횟수를 입력하세요.");
        int tryCount = scanner.nextInt();

        RacingMain racingMain = new RacingMain(carCount, tryCount);
        racingMain.run();
    }
}
