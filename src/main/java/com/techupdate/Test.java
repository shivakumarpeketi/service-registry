package com.techupdate;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Test {

    public static void main(String[] args) {
        BiFunction<Integer, String, Boolean> func = (x1, x2) -> true;

        Boolean r  = func.apply(2, "3");

        System.out.println(r); // 5

        // BinaryOperator
        BinaryOperator<Long> func2 = (x, y) -> {
            return x + y;
        };


        Long result = func2.apply(2L, 3L);

        System.out.println(result);
    }
}
