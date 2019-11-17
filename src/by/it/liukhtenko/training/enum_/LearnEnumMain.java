package by.it.liukhtenko.training.enum_;

public class LearnEnumMain {
    public static void main(String[] args) {
        SeasonDayEnum seasonDayEnum = new SeasonDayEnum(Season.WINTER,2);
        SeasonDayEnum seasonDayEnum1 = new SeasonDayEnum(Season.SPRING.ordinal(),3);
        System.out.println();
        Season season = Season.WINTER;
    }
}
