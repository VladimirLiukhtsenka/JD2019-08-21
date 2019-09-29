package by.it.zlotnikova.jd02_02;

class Utils {

    static int random(int max) {
        return (int) (Math.random() * (max + 1));
    }

    static int random(int from, int to) {
        return (int) (from + Math.random() * (to - from + 1));
    }
}
