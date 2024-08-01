package io.renanrcrr.funcprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

        Instructors.getAll().forEach(instructor -> {
            if (p2.test(instructor))
                System.out.println(instructor);
        });
    }

    public static boolean greaterThanYearsOfExperience(Instructor instructor){
        return instructor.getYearsOfExperience() > 10;
    }
}
