import java.util.Scanner;

public class RacingLevel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 대수를 입력하세요.");
        int carCount = scanner.nextInt();
        System.out.println("시도할 횟수를 입력하세요.");
        int tryCount = scanner.nextInt();

        RacingMain racingMain = new RacingMain(carCount, tryCount); //레이싱 메인 객체를 생성하여 저장값 대수, 횟수를 사용할 수 있게끔 전송? 한다.
        racingMain.run(); //run 메소드는 실행할 동작에 대한 코드를 작성 해놓은 메소드이다.
    }
}
