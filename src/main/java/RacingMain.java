import java.util.Random;

public class RacingMain {
    private int trycount;
    private int[] carPositions;

    public RacingMain(int carCount, int trycount) {
        this.trycount = trycount;
        carPositions = new int[carCount];
    }

    public void run() {
        for (int i = 0; i < carPositions.length; i++) {
            goCar();
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
