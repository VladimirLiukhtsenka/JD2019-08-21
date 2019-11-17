package by.it.liukhtenko.training.enum_;

public class SeasonDayEnum {
    private Season season;
    private int day;
    private int season1;

    public SeasonDayEnum(Season season, int day) {
        this.season = season;
        this.day = day;
    }

    public SeasonDayEnum(int season1,int day) {
        this.day = day;
        this.season1 = season1;
    }
}
