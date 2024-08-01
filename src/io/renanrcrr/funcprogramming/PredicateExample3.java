package io.renanrcrr.funcprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p1 = (i) -> i>100;
        System.out.println(p1.test(100));

        LongPredicate p2 = (i) -> i>100L;
        System.out.println(p2.test(11111111111111111L));

        DoublePredicate p3 = (i) -> i<100.25;
        System.out.println(p3.test(100.5));
    }
}
