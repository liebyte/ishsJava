import java.util.Scanner;

public class PrimeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int number = sc.nextInt();

        for(int i=2; i<number; i++) {
            if(number % i == 0) {
                counter ++;
                break;//counter = counter + 1
            }
            System.out.print(i + " ");
        }
        if(counter == 0) {
            System.out.println(number + " is a prime numnber~");
        }else {
            System.out.println(number + " is NOT prime number!");
        }
    }
}
