package by.it.liukhtenko.training;

public class Pi {
    public static void main(String[] args) {
        double  x,y,Skvadrat,Skryg,Relat,PointKrug = 0,PointKvadrat = 0,Pi;
        double R = 5;double D = 10,SkrygaRight;
        Skvadrat = D*D;
        for (int i = 0; i < 1000000; i++) {
            x = (Math.random() * 10) - 5;
            y = (Math.random() * 10) - 5;
            if ((x*x) + (y*y)<=R*R){
                PointKrug++;
                PointKvadrat++;
            }
            else {
                PointKvadrat++;
            }
        }
        Skryg = Skvadrat*PointKrug/PointKvadrat;
        Pi = 4*Skryg/(D*D);
        System.out.println(Pi);

    }
}
