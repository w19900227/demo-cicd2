package com.example.democicd.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TodosomethingTest {

    private Todosomething todosomething = new Todosomething();

    @ParameterizedTest
    @MethodSource("testCalcSource")
    void testCalc(Integer x, Integer y, Integer expected) {
        Integer actual = this.todosomething.calc(x, y);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testCalcSource() {
        return Stream.of(
                arguments(1, 1, 2),
                arguments(1, 2, 3),
                arguments(2, 1, 3),
                arguments(2, -1, 1)
        );
    }

}