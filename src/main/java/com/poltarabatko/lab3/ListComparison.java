package com.poltarabatko.lab3;

import java.util.List;

/**
 * @author r.poltarabatko
 */
public interface ListComparison {

    /**
     * Fills the provided list with integers up to the specified size.
     *
     * @param list The list to be filled.
     * @param size The size of the list.
     */
    void fillList(List<Integer> list, int size);

    /**
     * Measures the execution time of inserting elements at the end of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long insertEnd(List<Integer> list, int numberOfExecutions);

    /**
     * Measures the execution time of inserting elements in the middle of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long insertMiddle(List<Integer> list, int numberOfExecutions);

    /**
     * Measures the execution time of inserting elements at the beginning of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long insertStart(List<Integer> list, int numberOfExecutions);

    /**
     * Measures the execution time of removing elements from the end of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long removeEnd(List<Integer> list, int numberOfExecutions);

    /**
     * Measures the execution time of removing elements from the middle of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long removeMiddle(List<Integer> list, int numberOfExecutions);

    /**
     * Measures the execution time of removing elements from the beginning of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long removeStart(List<Integer> list, int numberOfExecutions);

    /**
     * Measures the execution time of getting an element from the end of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long getElementEnd(List<Integer> list, int numberOfExecutions);

    /**
     * Measures the execution time of getting an element from the middle of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long getElementMiddle(List<Integer> list, int numberOfExecutions);

    /**
     * Measures the execution time of getting an element from the beginning of the list.
     *
     * @param list              The list to perform the operation on.
     * @param numberOfExecutions The number of times the operation should be executed.
     * @return The total execution time in nanoseconds.
     */
    long getElementStart(List<Integer> list, int numberOfExecutions);
}
