package org.example.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");


        //Error!
//        for (String color : colors) {
//            System.out.println(color);
//            if (color.equals("Green")) {
//                colors.remove("Blue");
//            }
//        }


        Iterator<String> iterator = colors.iterator();
        //Enumeration collection
//        iterator.forEachRemaining(element -> System.out.println(element));
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Green")) {
                iterator.remove();
            }
        }

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
