package lesson_7;

import java.util.ArrayList;
import java.util.TreeSet;

public class ListLesson {

    public static void main(String[] args) {

        /*ArrayList <Integer> listOne = new ArrayList<Integer>();
        ArrayList <Integer> listTwo = new ArrayList<Integer>();
        ArrayList <Integer> listTree = new ArrayList<Integer>();

        for (int i = 1; i < 5;i++) {
            listOne.add(i);
        }

        int [] arr = {3,4,4,5,6};
        for (int i = 0; i < arr.length; i++){
            listTwo.add(arr[i]);
        }

        for (int i = 0; i < listOne.size();i++) {
            for (int j = 0; j < listTwo.size(); j++) {
                if (listOne.get(i).equals(listTwo.get(j))) {
                    listTree.add(listTwo.get(j));
                    continue;
                }
            }
        }
        for (Integer el:listTree)
        System.out.println(el);*/

        Student st1 = new Student();
        st1.setAge(5);
        st1.setFirstName("A");
        st1.setSecondName("B");

        Student st2 = new Student();
        st2.setAge(2);
        st2.setFirstName("C");
        st2.setSecondName("D");

        Student st3 = new Student();
        st3.setAge(3);
        st3.setFirstName("E");
        st3.setSecondName("F");

        TreeSet <Student> tree = new TreeSet<Student>();

        tree.add(st1);
        tree.add(st2);
        tree.add(st3);

        System.out.println(tree);

    }
}
