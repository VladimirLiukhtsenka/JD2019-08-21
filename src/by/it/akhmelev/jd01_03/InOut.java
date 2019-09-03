package by.it.akhmelev.jd01_03;

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
        System.out.println();
    }


    static void printArray(double[] array, String name, int colsCount) {
        for (int index = 0; index < array.length; index++) {
            System.out.printf("%s[% -3d]=%-8.3f ", name, index, array[index]);
            if ((index + 1) % colsCount == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
