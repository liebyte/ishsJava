import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input numerator : ");
        int numerator = scanner.nextInt();
        System.out.println("Input denominator : ");
        //double denominator = scanner.nextDouble();
        int denominator = scanner.nextInt();

        if(denominator == 0){
            System.out.println("분모에 0이 올 수 없습니다!");
        } else {
            System.out.println(numerator/denominator);
        }
    }
}
