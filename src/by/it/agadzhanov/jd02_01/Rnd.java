package by.it.agadzhanov.jd02_01;

import java.util.Random;

class Rnd {

    private static final long seed = System.currentTimeMillis();
    private static final Random random = new Random(seed);

    static int upTo(int max) {
        return fromTo(0,max);
    }

    static int fromTo(int from, int to) {
        return from + random.nextInt(to - from + 1);
    }

}
