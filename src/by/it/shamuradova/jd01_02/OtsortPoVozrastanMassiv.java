package by.it.shamuradova.jd01_02;

public class OtsortPoVozrastanMassiv {

    public static int [] sortirovka(int [] array){
        int a;
        for (int i = 0; i < array.length; i++) {
            int min= array[i];
            int index= i;
            for(int j  = i+1 ; j<array.length; j++){
                if (array [j]< min ){
                    min=array[j];
                    index = j;
                }
            }
            if (i!=index){
                a= array[i];
                array[i]= array[index];
                array[index]=a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array={8, 9, 5, 7, 2, 6, 3, 4, 0, 1};
        sortirovka(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
