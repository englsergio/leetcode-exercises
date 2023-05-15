package exercises;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoSortedLists { // Runtime beats 100%, Memory beats 84,62%.
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode temp = new ListNode(0, new ListNode());
        ListNode firstListNode = list1;
        while (temp.next != null) {
            if(list1.next == null) break;
            temp = list1.next;
            while (list2 != null && list2.val <= temp.val) {
                list1.next = list2;
                list1 = list2;
                list2 = list2.next;
            }
            list1.next = temp;
            list1 = temp;
            if(list2 == null) return firstListNode;
        }
        list1.next = list2;
        return firstListNode;
    }
}