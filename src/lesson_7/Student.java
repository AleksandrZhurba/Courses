package lesson_7;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String firstName;
    private String SecondName;
    private int age;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        this.SecondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        String firstName = this.getFirstName();
        String lastName = o.getFirstName();
        int result = firstName.compareTo(lastName);
        return result;
    }
}
