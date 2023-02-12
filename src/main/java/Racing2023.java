import java.util.Random;
import java.util.Scanner;

public class Racing2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // String 및 int 값 저장에 필요로 생성
        Random random = new Random(); // 랜덤함수를 필요로 생성

        System.out.println("안녕하세요 오랜만입니다. 설정할 닉네임을 적어주세요.");
        String name = scanner.nextLine(); // 닉네임 초기화
        System.out.println( name + "님 환영합니다."); // 출력

        System.out.println("자동차 경주 게임을 시작합니다. 경주 할 자동차의 대 수를 설정 해주세요.");
        int carCount = scanner.nextInt(); // 대 수를 인트값으로 초기화
        System.out.println("시도할 횟수를 설정 해주세요.");
        int tryCount = scanner.nextInt(); // 횟수를 인트값으로 초기화

        for (int i = 0; i < carCount; i++) {  //대 수가 5일때 0(i)과 5를 비교후 참일경우 실행, 되돌아오면, i에 1을 추가 후 반복
            for (int j = 0; j < tryCount; j++) {
                if(random.nextInt(10) >= 4) { // 랜덤 4이상일경우 출력하게끔 셋팅
                    System.out.print("-");


                }
            }
            System.out.println();
        }
    }
}
