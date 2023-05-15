package test;

import exercises.ListNode;
import org.junit.jupiter.api.Test;

import static exercises.MergeTwoSortedLists.mergeTwoLists;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    void test1() {
        ListNode res = mergeTwoLists(
                listNodeBuilder(new int[]{2, 3, 4, 8}),
                listNodeBuilder(new int[]{1, 7}));
        assertEquals(listNodeBuilder(new int[]{1, 2, 3, 4, 7, 8}), res);
    }

    @Test
    void test2() {
        ListNode res = mergeTwoLists(
                listNodeBuilder(new int[]{1,2,4}),
                listNodeBuilder(new int[]{1,3,4}));
        assertEquals(listNodeBuilder(new int[]{1,1,2,3,4,4}), res);
    }

    @Test
    void test3() {
        ListNode res = mergeTwoLists(
                listNodeBuilder(new int[]{5}),
                listNodeBuilder(new int[]{1,2,4}));
        assertEquals(listNodeBuilder(new int[]{1,2,4,5}), res);
    }

    ListNode listNodeBuilder(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        return head;
    }
}
