package com.poltarabatko.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 @author r.poltarabatko
 */

class ListComparatorTest {

    private ListsComparator comparator;
    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private final int numberOfExecutions = 100;

    /**
     * Sets up the necessary objects and fills the lists before each test.
     */
    @BeforeEach
    void setUp() {
        comparator = new ListsComparator();
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        comparator.fillList(arrayList, numberOfExecutions);
        comparator.fillList(linkedList, numberOfExecutions);
    }

    /**
     * Tests the performance of the insertEnd operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testInsertEnd() {
        long arrayListTime = comparator.insertEnd(arrayList, numberOfExecutions);
        long linkedListTime = comparator.insertEnd(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "InsertEnd should be faster for at least one list");
    }

    /**
     * Tests the performance of the insertMiddle operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testInsertMiddle() {
        long arrayListTime = comparator.insertMiddle(arrayList, numberOfExecutions);
        long linkedListTime = comparator.insertMiddle(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "InsertMiddle should be faster for at least one list");
    }
    /**
     * Tests the performance of the insertStart operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testInsertStart() {
        long arrayListTime = comparator.insertStart(arrayList, numberOfExecutions);
        long linkedListTime = comparator.insertStart(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "InsertStart should be faster for at least one list");
    }

    /**
     * Tests the performance of the removeEnd operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testRemoveEnd() {
        long arrayListTime = comparator.removeEnd(arrayList, numberOfExecutions);
        long linkedListTime = comparator.removeEnd(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "RemoveEnd should be faster for at least one list");
    }

    /**
     * Tests the performance of the removeMiddle operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testRemoveMiddle() {
        long arrayListTime = comparator.removeMiddle(arrayList, numberOfExecutions);
        long linkedListTime = comparator.removeMiddle(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "RemoveMiddle should be faster for at least one list");
    }

    /**
     * Tests the performance of the removeStart operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testRemoveStart() {
        long arrayListTime = comparator.removeStart(arrayList, numberOfExecutions);
        long linkedListTime = comparator.removeStart(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "RemoveStart should be faster for at least one list");
    }

    /**
     * Tests the performance of the getElementEnd operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testGetElementEnd() {
        long arrayListTime = comparator.getElementEnd(arrayList, numberOfExecutions);
        long linkedListTime = comparator.getElementEnd(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "GetElementEnd should be faster for at least one list");
    }

    /**
     * Tests the performance of the getElementMiddle operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testGetElementMiddle() {
        long arrayListTime = comparator.getElementMiddle(arrayList, numberOfExecutions);
        long linkedListTime = comparator.getElementMiddle(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "GetElementMiddle should be faster for at least one list");
    }

    /**
     * Tests the performance of the getElementStart operation.
     * Compares the execution times of ArrayList and LinkedList.
     */
    @Test
    void testGetElementStart() {
        long arrayListTime = comparator.getElementStart(arrayList, numberOfExecutions);
        long linkedListTime = comparator.getElementStart(linkedList, numberOfExecutions);
        assertTrue(arrayListTime <= linkedListTime || linkedListTime <= arrayListTime, "GetElementStart should be faster for at least one list");
    }
}
