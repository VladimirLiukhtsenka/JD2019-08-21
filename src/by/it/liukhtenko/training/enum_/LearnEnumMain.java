package by.it.liukhtenko.training.enum_;

public class LearnEnumMain {
    public static void main(String[] args) {
        SeasonDayEnum seasonDayEnum = new SeasonDayEnum(Season.SPRING,2);
        System.out.println();
        SeasonDayEnum seasonDayEnum1 = new SeasonDayEnum(Season.AUTUMN,3);
        System.out.println();
        Season season = Season.WINTER;
    }
}
