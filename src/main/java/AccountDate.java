import java.util.Scanner;

public class AccountDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("안녕하세요 이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.println("환영합니다 " + name + "님");
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("원하시는 항목을 입력하세요");
            System.out.println("1 : 데이터 입력, 2: 데이터 수정, 3: 데이터 삭제, 4: 종료");
            int choiceNumber = Integer.parseInt(scanner.nextLine());

            if (choiceNumber < 1 || choiceNumber >= 5) {
                System.out.println("숫자를 잘못 입력하셨습니다.");


            }
        }
    }
}
