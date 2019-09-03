package by.it.yuntsevich.jd01_03;


class InOut {

    static double[] getArray(String line) {
        line = line.trim();
        String[] arrayString = line.split(" ");
        double[] array = new double[arrayString.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(arrayString[i]);
        }
        return array;
    }
    static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");

        }
        System.out.println("\n");
    }


    static void printArray(double[] array, String name, int colsCount) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d]=%-8.3f ", name, i, array[i]);
            if ((i + 1) % colsCount == 0) {
                System.out.println();
            }

        }
        System.out.println();
    }
}
