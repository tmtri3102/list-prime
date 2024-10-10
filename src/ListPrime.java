import java.util.Scanner;

public class ListPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        int numbers = input.nextInt();
        int N = 2;
        int count = 0;
        while (count < numbers) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if(N % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(N);
                count++;
            }
            N++;
        }



    }
}
