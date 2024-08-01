package io.renanrcrr.funcprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        //all instructors who teaches online
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses()==true;
        //instructor experience > 10
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

        //all instructors
        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            if(p1.test(instructor))
                System.out.println(instructor);
        });

        //is instructor online and experience > 10
        System.out.println("------------------");
        instructors.forEach(instructor -> {
            if(p1.and(p2).test(instructor))
                System.out.println(instructor);
        });
    }
}
