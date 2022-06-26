public class NumberChange {
    public static void main(String[] args) {

        int a = 1, b = 2;
        int tmp = 0;

        System.out.println("a = " + a + " b = " + b);

        tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a + " b = " + b);
    }
}
