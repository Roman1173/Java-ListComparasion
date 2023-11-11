package com.poltarabatko.lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 * @author r.poltarabatko

 */
public class Main {

    public static void main(String[] args) {
        ListsComparator comparator = new ListsComparator();
        int numberOfExecutions = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        comparator.fillList(arrayList, numberOfExecutions);
        comparator.fillList(linkedList, numberOfExecutions);

        System.out.printf("%-20s%-20s%-20s%-25s%n", "Operation", "ArrayList", "LinkedList", "Number of method calls");

        printCompare(comparator, arrayList, linkedList, numberOfExecutions);
    }
    /**
     * Prints the comparison results for various list operations in a tabular format.
     *
     * @param comparator         The ListsComparator instance for comparison.
     * @param arrayList          The ArrayList for comparison.
     * @param linkedList         The LinkedList for comparison.
     * @param numberOfExecutions The number of method executions for each operation.
     */
    private static void printCompare(ListsComparator comparator, List<Integer> arrayList, List<Integer> linkedList, int numberOfExecutions) {
        printTableRow("Insert End", comparator.insertEnd(arrayList, numberOfExecutions), comparator.insertEnd(linkedList, numberOfExecutions), numberOfExecutions);
        printTableRow("Insert Middle", comparator.insertMiddle(arrayList, numberOfExecutions), comparator.insertMiddle(linkedList, numberOfExecutions), numberOfExecutions);
        printTableRow("Insert Start", comparator.insertStart(arrayList, numberOfExecutions), comparator.insertStart(linkedList, numberOfExecutions), numberOfExecutions);

        printTableRow("Remove End", comparator.removeEnd(arrayList, numberOfExecutions), comparator.removeEnd(linkedList, numberOfExecutions), numberOfExecutions);
        printTableRow("Remove Middle", comparator.removeMiddle(arrayList, numberOfExecutions), comparator.removeMiddle(linkedList, numberOfExecutions), numberOfExecutions);
        printTableRow("Remove Start", comparator.removeStart(arrayList, numberOfExecutions), comparator.removeStart(linkedList, numberOfExecutions), numberOfExecutions);

        printTableRow("Get End", comparator.getElementEnd(arrayList, numberOfExecutions), comparator.getElementEnd(linkedList, numberOfExecutions), numberOfExecutions);
        printTableRow("Get Middle", comparator.getElementMiddle(arrayList, numberOfExecutions), comparator.getElementMiddle(linkedList, numberOfExecutions), numberOfExecutions);
        printTableRow("Get Start", comparator.getElementStart(arrayList, numberOfExecutions), comparator.getElementStart(linkedList, numberOfExecutions), numberOfExecutions);
    }

    /**
     * Prints a row of the comparison table with operation names, execution times, and the number of method calls.
     *
     * @param operation          The name of the list operation.
     * @param arrayListTime      The execution time for the operation on ArrayList.
     * @param linkedListTime     The execution time for the operation on LinkedList.
     * @param numberOfMethodCalls The number of method calls for the operation.
     */
    private static void printTableRow(String operation, long arrayListTime, long linkedListTime, int numberOfMethodCalls) {
        System.out.printf("%-20s%-20d%-20d%-25d%n", operation, arrayListTime, linkedListTime, numberOfMethodCalls);
    }
}
