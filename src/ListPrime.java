public class ListPrime {
    public static void main(String[] args) {

        int numbers = 100;
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
