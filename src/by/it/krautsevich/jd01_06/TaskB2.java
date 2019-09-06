package by.it.krautsevich.jd01_06;

public class TaskB2 {
    public static void main(String[] args) {

    TaskB();
    }

    private static void TaskB() {
        String poem1 = Poem.text;
        String [] poem = poem1.split("[.!?]");
        for (int i = 0; i < poem.length; i++) { poem[i] = poem[i].trim();}



        for (int numberOfSort = 0; numberOfSort < poem.length - 1; numberOfSort++)
            for (int i = 0; i < poem.length - 1; i++) {
                String forSort = poem[0];
                if (poem[i].length() > poem[i + 1].length()) {
                    forSort = poem[i + 1];
                    poem[i + 1] = poem[i];
                    poem[i] = forSort;}}
        for (int i = 0; i < poem.length -1; i++) {
            System.out.println(poem[i]);
        }





    }}

