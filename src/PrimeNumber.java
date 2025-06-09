public class PrimeNumber {
    private static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        if(isPrime(n)) System.out.print(n+ "is prime number.");
        else System.out.println(n + "is  not a prime number.");
    }
}
