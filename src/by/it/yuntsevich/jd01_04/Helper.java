package by.it.yuntsevich.jd01_04;

class Helper {
    static void sort(double[] array) {
        boolean swap;
        int last = array.length - 1;
        do {
            swap = false;
            for (int i = 0; i < last; i++) {
                if (array[i] > array[i + 1]) {
                    double a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    swap = true;
                }
            }
            last--;
        }
        while (swap);

        InOut.printArray(array);
    }
}
