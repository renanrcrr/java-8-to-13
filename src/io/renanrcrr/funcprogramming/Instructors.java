package io.renanrcrr.funcprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor("Mike", 10, "Software Development", "M", true, Arrays.asList("C++, Java, PHP"));
        Instructor instructor2 = new Instructor("Jenny", 5, "Engineer", "F", false, Arrays.asList("Agile, Python, OS"));
        Instructor instructor3 = new Instructor("Jim", 7, "Manager", "M", true, Arrays.asList("Pascal, React, Javascript"));
        Instructor instructor4 = new Instructor("Dani", 3, "Designer", "F", false, Arrays.asList("XP, UI, Angular"));
        Instructor instructor5 = new Instructor("Asim", 15, "Product Owner", "M", true, Arrays.asList("Multithreading, Vue, Typescript"));

        List<Instructor> list = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
        return list;
    }
}
