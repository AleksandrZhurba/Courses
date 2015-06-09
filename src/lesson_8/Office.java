package lesson_8;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Office {

    private Premii premii = new Premii();
    private LinkedList<Emploer> emploers = new LinkedList<>();

    public void givePrem (Emploer emploer, int count) {
        premii.givePrem(emploer, count);
    }

    public void addEmploer (Emploer e) {
        emploers.add(e);
    }

    public List<Emploer> getFromToSalary(int from, int to){
        List<Emploer> result = new LinkedList<Emploer>();

        for (Emploer empl: emploers){
            int salary = empl.getSalary();
            if(salary > from && salary < to) {
                result.add(empl);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Office{" +
                "emploers=" + emploers +
                '}';
    }

    public void sortBySalary() {
        Collections.sort(emploers, new Comparator<Emploer>() {
            @Override
            public int compare(Emploer o1, Emploer o2) {
                Integer s1 = o1.getSalary();
                Integer s2 = o2.getSalary();
                return s1.compareTo(s2);
            }
        });
    }

    public void sortByName () {
        Collections.sort(emploers);
    }

    public int paySalary(Emploer em) {
        int salary = em.getSalary();
        if (premii.isEmplWithPrem(em)) {
            return salary = salary + premii.getPrem(em);
        } else
        {
            return salary;
        }
    }


}
