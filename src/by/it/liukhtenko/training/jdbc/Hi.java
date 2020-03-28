package by.it.liukhtenko.training.jdbc;

public class Hi extends Entity{
    private int id;
    private String title;

    public Hi(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public Hi (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Hi{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
