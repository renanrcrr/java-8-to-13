package io.renanrcrr.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        BiPredicate<Boolean, Integer> p3 = (online, experience) -> online==true && experience>10;

        //BiConsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) ->
                System.out.println("Name is " + name + " courses : " + courses);

        instructors.forEach(instructor -> {
            if(p3.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience()))
                biConsumer.accept(instructor.getName(), instructor.getCoursers());
        });
    }
}
