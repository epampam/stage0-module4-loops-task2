package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int n = 2;
        while (n <= printToInclusive) {
            boolean isPrime = true;
            int i = 2;
            while (i * i <= n) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) System.out.println(n);
            n++;
        }
    }


    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(31);
    }
}