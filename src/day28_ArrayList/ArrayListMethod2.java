package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

       /* int num = 1;

        list.remove(num);

        System.out.println(list);*/

        Integer num = 200;
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);

        System.out.println("--------------------------------");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());
        System.out.println(list);

        System.out.println("------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);



        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));

        System.out.println("----------------------------------------");


        boolean r4 = list1.isEmpty();

        System.out.println("r4 = " + r4);
        System.out.println("---------------------------------------");

        ArrayList<Integer> number = new ArrayList<>();
        // Bulk operation
        number.addAll(Arrays.asList(1,2,3,4,5,6,7));











    }
}
