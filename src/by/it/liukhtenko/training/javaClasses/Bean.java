package by.it.liukhtenko.training.javaClasses;

import java.io.Serializable;
import java.util.Objects;

public class Bean implements Serializable {
    static {
        field = "default";
    }

    static String field;
    private String name;
    private int id;
    {
        name = "Olga";
    }
    public Bean (){}
    public Bean(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bean bean = (Bean) o;
        return id == bean.id &&
                Objects.equals(name, bean.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
