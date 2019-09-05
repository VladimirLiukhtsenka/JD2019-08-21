package by.it.zlotnikova.jd01_03;

public class InOut {

    /**
     * @author e.zlotnikova
     * Parses the string of numbers devided by spaces into array of doubles.
     * @param line the string to be converted into array
     * @return res the array of doubles
     */
    public static double[] getArray(String line) {
        line = line.trim();
        String[] strArray = line.split(" ");
        int count = strArray.length;
        double[] res = new double[count];
        for (int i = 0; i < count; i++) {
            res[i] = Double.parseDouble(strArray[i]);
        }
        return res;
    }

    /**
     * @author e.zlotnikova
     * Prints the array in a row of numbers divided by spaces.
     * @param arr the array of doubles
     */
    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * @author e.zlotnikova
     * Prints the array, including the name of array and an index for each element, into specified amount of columns.
     * @param arr the array to be printed.
     * @param name the name of array.
     * @param columnCount amount of columns to divide the array into.
     */
    public static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10.5f ", name, i, arr[i]);
            if ((i + 1) % columnCount == 0 || (i + 1) == arr.length)
                System.out.println();
        }
    }
}