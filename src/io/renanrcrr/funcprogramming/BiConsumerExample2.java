package io.renanrcrr.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //print out name and gender of instructor
        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("Name is: " + name + " and gender is: " + gender);
        instructors.forEach(instructor -> {
            biConsumer.accept(instructor.getName(), instructor.getGender());
        });

        //print out name and list of courses
        System.out.println("------------------------");
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out.println("Name is " + name + " courses: " + courses);
        instructors.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(), instructor.getCoursers());
        });

        //print out name and gender of all instructors who teaches online
        System.out.println("------------------------");
        BiConsumer<String, String> biConsumer2 = (name, gender) -> System.out.println("Name is " + name + " gender: " + gender);
        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses())
                biConsumer2.accept(instructor.getName(), instructor.getGender());
        });
    }
}
