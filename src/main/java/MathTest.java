import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수학시험은 잘 보셨나요? 가채점 점수를(숫자만) 입력하시면, 당신의 등급 및 합격 유무가 나옵니다.");
        int score = scanner.nextInt();
        char grade = ' ';

        if(score <= 90) {
            grade = 'A';
            System.out.println("");

        }
    }
}

//잠시 중단