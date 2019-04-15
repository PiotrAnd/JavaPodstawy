package training.core.collections.list;

import java.lang.reflect.Array;
import java.util.*;

public class ListExamples {
    static List<Integer> integersLinkedList;
    static List<Integer> integersArrayList;

    public static void main(String[] args) {
        integersLinkedList = new LinkedList<>();
        integersArrayList = new ArrayList<>();// test na porownanei szybkosci list

        Date startTime;
        Date endTime;

        System.out.println("Linked list test");
        startTime = new Date();
        for (long i = 0; i <1_000_000; i++ ){
            integersLinkedList.add(10);
        }
        endTime = new Date();
        long runTime = endTime.getTime() - startTime.getTime();
        System.out.println("Linked list test: " + runTime);
        //**********************************************************
        System.out.println("Array list test");
        startTime = new Date();
        for (long i = 0; i <1_000_000; i++ ){
            integersArrayList.add(10);
        }
        endTime = new Date();
        runTime = endTime.getTime() - startTime.getTime();
        System.out.println("Array list test: " + runTime);

        Arrays.asList(integersArrayList); // przezucenei arrayList do LinkedList
        integersLinkedList.toArray();// przezucenie LinkedList do arrayList

        integersLinkedList = new LinkedList<>();
        integersLinkedList.add(3);
        integersLinkedList.add(4);
        integersLinkedList.add(36);
        integersLinkedList.add(-3);
        for (Integer el : integersLinkedList){
            System.out.println(el);
        }
        Collections.sort(integersLinkedList);
            for (Integer el : integersLinkedList){
                System.out.println(el); // sortowanie listy
        }
        //***********************************************************
        integersLinkedList = new LinkedList<Integer>(){{
            add(7);
            add(-9);
            add(0);
        }};
        Collections.reverse(integersLinkedList);
        for (Integer el: integersLinkedList)
            System.out.println(el);

    }

}
