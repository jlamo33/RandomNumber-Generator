public class PuesdoRandom {

    private long seed; // starting integer
    private long modulus; // moldulus
    private long increment; // b
    private long multiplier; // muliplplier

    public PuesdoRandom() {

    }

    public long[] linearGenartator(long seed, int n) {
        long[] rand = new long[n];
        multiplier = 102020;
        long multiplier2 = 136236;
        increment = 18282;
        modulus = 1029282811;

        rand[0] = seed;

        for (int i = 1; i < n; i++) {
            rand[i] = (multiplier * rand[i - 1] + increment) % modulus;

            if (rand[i] < 0) {
                rand[i] = rand[i] * -1;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rand[i] + " ");
        }

        return rand;

    }

}
