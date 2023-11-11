package com.poltarabatko.lab3;

import java.util.List;
import java.util.Random;

/**
    @author r.poltarabatko
 */
public class ListsComparator implements ListComparison {

    /**
     * Fills the given list with random integers.
     *
     * @param list The list to be filled.
     * @param size The number of elements to add to the list.
     */
    @Override
    public void fillList(List<Integer> list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
    }

    /**
     * Inserts elements at the end of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long insertEnd(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(i);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Inserts elements in the middle of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long insertMiddle(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(list.size() / 2, i);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Inserts elements at the beginning of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long insertStart(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(0, i);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Removes elements from the end of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long removeEnd(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.remove(list.size() - 1);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Removes elements from the middle of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long removeMiddle(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.remove(list.size() / 2);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Removes elements from the beginning of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long removeStart(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.remove(0);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Retrieves elements from the end of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long getElementEnd(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.get(list.size() - 1);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Retrieves elements from the middle of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long getElementMiddle(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.get(list.size() / 2);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Retrieves elements from the beginning of the list and measures the time taken.
     *
     * @param list               The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total time taken for the operation in nanoseconds.
     */
    @Override
    public long getElementStart(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.get(0);
        }
        return System.nanoTime() - startTime;
    }
}
