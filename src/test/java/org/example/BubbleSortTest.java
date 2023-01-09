package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void shouldSortIntegers(){
        //given
        List<Comparable> unsortedList = Arrays.asList(1,4,5,6,8,3,8);
        List<Comparable> result = Arrays.asList(1,3,4,5,6,8,8);
        //when
        bubbleSort.sort(unsortedList);
        //then
        assertArrayEquals(unsortedList.toArray(), result.toArray());
    }

    @Test
    void shouldSortDoubles(){
        //given
        List<Comparable> unsortedList = Arrays.asList(-9.3, 0.2, 4d, 0.1, 5d, 9d);
        List<Comparable> result = Arrays.asList(-9.3, 0.1, 0.2, 4d, 5d, 9d);
        //when
        bubbleSort.sort(unsortedList);
        //then
        assertArrayEquals(unsortedList.toArray(), result.toArray());
    }

    @Test
    void shouldReturnEmptyWhenInputEmpty(){
        //given
        List<Comparable> unsortedList = new ArrayList<>();
        List<Comparable> result = new ArrayList<>();
        //when
        bubbleSort.sort(unsortedList);
        //then
        assertArrayEquals(unsortedList.toArray(), result.toArray());
    }

    @Test
    void shouldThrowExceptionIfInputIsNull(){
        //given
        //when
        //then
        assertThrows(RuntimeException.class, () -> bubbleSort.sort(null));
    }

}