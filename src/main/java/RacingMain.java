import java.util.Random;

public class RacingMain {
    private int trycount; // 정수형 변수 생성, 퍼블릭은 외부에서 값 대입이 가능하지만, 프라이베이트는 직접적으로 불가.
    private int[] carPositions; //Private 변수에 값을 대입하기 위해서는 public 으로 제공되는 SET 함수를 사용하는 방식으로 해야합니다.<< 그냥 알아두기

    public RacingMain(int carCount, int trycount) {   //레이싱레벨2 클래스에서 저장한 변수 가지고오기,
        this.trycount = trycount; //int carCount, int trycount를 생성자 this가 가져와서 초기화를 한다.
        carPositions = new int[carCount]; //카포지션스 변수를 !@#$!
    }

    public void run() {
        for (int i = 0; i < carPositions.length; i++) { //렝스는 배열의 길이 수를 뜻함. ex) 1,2,3 = 렝스는 3
            goCar(); //고카 메소드 실행
            System.out.println();
        }
    }

    public void goCar() {
        Random random = new Random();

        for (int i = 0; i < trycount; i++) {
            if(random.nextInt(10) > 3) {
                System.out.print("-");
            }
        }
    }
}
