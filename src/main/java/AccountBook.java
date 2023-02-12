import java.util.Scanner;

public class AccountBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.println("환영합니다!" + name + " 님");

    }
}
