package io.renanrcrr.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //Loop through all the instructor and print out the values of instructor
        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);

        //Loop through all the instructor and print out only their names
        System.out.println("--------------------------");
        Consumer<Instructor> c2 = (s2) -> System.out.print(s2.getName());
        instructors.forEach(c2);

        //Loop through all the instructor and print out only their courses
        System.out.println("--------------------------");
        Consumer<Instructor> c3 = (s3) -> System.out.println(s3.getCoursers());
        instructors.forEach(c2.andThen(c3));

        //Loop through all the instructor and print out their names if the years of experience is > 10
        System.out.println("--------------------------");
        instructors.forEach(s1 -> {
            if(s1.yearsOfExperience > 10)
                c1.accept(s1);
        });

        //Loop through all the instructors and print out their name and years of experience if it is > 5 and teaches course online
        System.out.println("--------------------------");
        instructors.forEach(s1 -> {
            if(s1.yearsOfExperience > 5 && !s1.isOnlineCourses())
                c1.andThen(c2).accept(s1);
        });
    }
}
