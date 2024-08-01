package io.renanrcrr.funcprogramming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        IntConsumer intConsumer = a -> System.out.println(a*10);
        intConsumer.accept(10);

        LongConsumer longConsumer = b -> System.out.println(b*10L);
        longConsumer.accept(10L);

        DoubleConsumer doubleConsumer = c -> System.out.println(c*10);
        doubleConsumer.accept(10.5);
    }
}
