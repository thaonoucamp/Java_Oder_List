package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXep {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();

        listString.add("c");
        listString.add("b");
        listString.add("a");
        listString.add("d");

        for (String s : listString) {
            System.out.println(s);
        }

        System.out.println("---");

        Collections.sort(listString);
        for (String s : listString) {
            System.out.println(s);
        }

        System.out.println("---");
        // ArrayList chi choi voi Obj;
        List<Integer> list =  new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("---");

        // Sap xep theo thu tu tang dan;
        Collections.sort(list);

        for (int i : list) {
            System.out.println(i);
        }
    }
}