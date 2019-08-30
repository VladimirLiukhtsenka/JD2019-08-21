package by.it.akhmelev.jd01_03;

class Helper {

    static double findMin(double[] arr) {
        double min = Double.MAX_VALUE;
        for (double value : arr) {
            if (value < min)
                min = value;
        }
        return min;
    }


}
