package excerise1;

import section1.dataStructures.LinkedList;

public class Exercise_1_3_20 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        print(list);
        list.remove(4);
        print(list);
        list.remove(1);
        print(list);
        list.remove(1);
        print(list);
        list.remove(0);
        print(list);

    }

    public static void print(LinkedList<Integer> list){
        System.out.println("Size "+ list.size());
        for (Integer i:
                list ) {
            System.out.println(i);
        }
    }
}
