package test;

import exercises.ListNode;
import org.junit.jupiter.api.Test;

import static exercises.RemoveNthNodeFromEndOfList.removeNthFromEnd;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    void test1() {
        ListNode res = removeNthFromEnd(listNodeBuilder(new int[]{1, 2, 3, 4, 5}), 2);
        assertEquals(listNodeBuilder(new int[]{1, 2, 3, 5}), res);
    }

    @Test
    void test2() {
        ListNode res = removeNthFromEnd(listNodeBuilder(new int[]{1}), 1);
        assertNull(res);
    }

    @Test
    void test3() {
        ListNode res = removeNthFromEnd(listNodeBuilder(new int[]{1,2}), 2);
        assertEquals(listNodeBuilder(new int[]{2}), res);
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
