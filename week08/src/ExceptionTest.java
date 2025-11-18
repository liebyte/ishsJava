import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input numerator : ");
        int numerator = scanner.nextInt();
        System.out.println("Input denominator : ");
        int denominator = scanner.nextInt();

        System.out.println(numerator/denominator);
    }
}
