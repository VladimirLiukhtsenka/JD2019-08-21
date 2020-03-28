package by.it.liukhtenko.training.streams;

import java.math.BigDecimal;
import java.util.Objects;

public class Specialist {
    private String name;
    private BigDecimal salary;
    private Specialty specialty;

    public Specialist() {
    }

    public Specialist(String name, BigDecimal salary, Specialty specialty) {
        this.name = name;
        this.salary = salary;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialist that = (Specialist) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(salary, that.salary) &&
                specialty == that.specialty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, specialty);
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", specialty=" + specialty +
                '}';
    }
}
