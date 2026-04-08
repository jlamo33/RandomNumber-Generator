public class Random {
    public static void main(String[] args) throws Exception {

        generateRandomNumbers(12, 25, 999999999, 252149039, 11);
    }

    static void generateRandomNumbers(int n, long seed, long modulus, long multiplier, long increment) {

        long[] arr = new long[n];

        arr[0] = seed;

        for (int i = 1; i < n; i++) {

            arr[i] = (multiplier * arr[i - 1] + increment) % modulus;
        }

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + " ");
        }
    }
}
