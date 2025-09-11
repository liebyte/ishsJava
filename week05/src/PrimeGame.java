import java.util.Scanner;

public class PrimeGame {
    //숫자 하나를 넘겨 받아서 해당 수가 소수면 true 리턴, 소수가 아니면 false 리턴
    public static boolean isPrime(int n) {
        if(n <=1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int number = sc.nextInt();

        if(isPrime(number)) {
            System.out.println(number + " is a prime numnber~");
        }else {
            System.out.println(number + " is NOT prime number!");
        }
    }
}
