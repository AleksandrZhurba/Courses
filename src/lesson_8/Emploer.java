package lesson_8;

public class Emploer implements Comparable<Emploer>{

    private String name;
    private int salary;



    public Emploer() {
        super();
    }

    public Emploer(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emploer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emploer o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}
