package io.renanrcrr.funcprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mike", 10,
                "Software Developer", "M", true, Arrays.asList("Java Programming", "Python", "C++"));

        System.out.println(instructor);
    }
}
