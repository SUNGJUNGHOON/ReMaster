import java.util.Scanner;

public class AverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;   //점수를 저장하기 위한 변수, 0으로 초기화
        char grade = ' ';    //등급을 저장하기 위한 문자형 변수, 등급을 넣어야 하니 공백으로 저장.

        System.out.println("당신의 점수를 입력하세요.");
        score = scanner.nextInt(); //입력한 인트값을 변수 스코어에 초기화

        if(score >= 90) {  //입력한 인트값이 90이상일때, 문자형 변수 grade에 A를 초기화 한다. 이하 내용 동일
            grade = 'A';
        }
        else if(score >= 80) {
            grade = 'B';
        }
        else if(score >= 70) {
            grade = 'C';
        }
        else {     //그외 점수는 D를 초기화
            grade = 'D';
        }
        System.out.println("당신은 " + grade + "등급입니다.");
    }
}
