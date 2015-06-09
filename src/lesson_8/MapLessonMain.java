package lesson_8;

import java.util.List;

public class MapLessonMain {

    public static void main(String[] args) {

        /*MultiMapImpl<Integer, String> multiMap = new MultiMapImpl<Integer,String>();

        multiMap.put(1,"Value number one");
        multiMap.put(1,"Value number two");
        multiMap.put(3,"Value number tree");

        System.out.println(multiMap);*/

        Emploer emp1 = new Emploer("Vuyasya",200);
        Emploer emp2 = new Emploer("Lesha",300);
        Emploer emp3 = new Emploer("Sereja",100);
        Emploer emp4 = new Emploer("Alex",500);
        Emploer emp5 = new Emploer("Petya",750);

        Office office = new Office();
        office.addEmploer(emp1);
        office.addEmploer(emp2);
        office.addEmploer(emp3);
        office.addEmploer(emp4);
        office.addEmploer(emp5);

        List<Emploer> res = office.getFromToSalary(100,2000);
        System.out.println(res);

        office.sortByName();
        System.out.println(office);

        office.sortBySalary();
        System.out.println(office);

        office.givePrem(emp1, 500);
        office.givePrem(emp5, 1);
        int zp = office.paySalary(emp5);
        System.out.println(zp);
    }

}
