package by.it.krautsevich.jd01_06;



public class TaskB1 {


    public static void main(String[] args) {

        TaskB() ;
    }

    private static void TaskB() {

        String poem1 = new String(Poem.text);
        String glas1 = new String("аАиИеЕёЁоОуУыЭэЮюЯя" ) ;
        String [] poem = poem1.split("[\\p{Punct}\\s]+");


        for (int i = 0; i < poem.length ; i++) {
            String word = poem[i] ;
            char [] myCharArray = word.toCharArray ();

            int sogl = glas1.indexOf(myCharArray[0]) ;
            int glas = glas1.indexOf(myCharArray[myCharArray.length -1]);
            if ( (sogl < 0) && (glas>=0) ) {
                System.out.println(word);
            }


        }







    }
}
