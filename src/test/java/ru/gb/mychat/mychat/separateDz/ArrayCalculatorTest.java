package ru.gb.mychat.mychat.separateDz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCalculatorTest {

    private static ArrayCalculator ac;

    @BeforeAll
    public static void before() {
        ac = new ArrayCalculator();
    }


    @Test
    public void pullOutMethodShouldReturnValuesAfterLastValue4() {
        int[] input = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] output = {1, 7};

        assertArrayEquals(output, ac.pullOut(input));
    }

    @Test
    public void pullOutMethodShouldReturnEmptyArrayWhenLastElementValue4() {
        int[] input = {1, 2, 3, 4};
        int[] output = {};

        assertArrayEquals(output, ac.pullOut(input));
    }

    @Test
    void pullOutMethodShouldThrowRuntimeExceptionWhenArrayDoesNotContainValue4() {

        int[] input = {1, 2, 3};
        assertThrows(RuntimeException.class, () -> ac.pullOut(input), "В массиве нет элемента, содержащего значение 4");
    }

    @Test
    public void pullOutMethodShouldThrowRuntimeExceptionWhenArrayContainsNoElements() {

        int[] input = {};
        assertThrows(RuntimeException.class, () -> ac.pullOut(input), "Массив должен содержать хотя бы один элемент");
    }

    @Test
    public void checkMethodTest1() {
        int[] input = {2, 3, 4};
        assertTrue(ac.check(input));
    }

    @Test
    public void checkMethodTest2() {
        int[] input = {1, 2, 3};
        assertTrue(ac.check(input));
    }

    @Test
    public void checkMethodTest3() {
        int[] input = {1, 2, 3, 4};
        assertTrue(ac.check(input));
    }

    @Test
    public void checkMethodTest4() {
        int[] input = {2, 3};
        assertFalse(ac.check(input));
    }

    @Test
    public void checkMethodTest5() {
        int[] input = {};
        assertFalse(ac.check(input));
    }


}
