package exercises;

public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currHead = head;
        ListNode nodeToBeRemapped = head;
        ListNode temp;
        int indexToBeRemapped = 0;

        while(currHead.next != null) {
            currHead = currHead.next;           //situação onde o primeiro tem que ser removido
            indexToBeRemapped++;                //se ++index == n
            if (indexToBeRemapped > n) {
                temp = nodeToBeRemapped;
                nodeToBeRemapped = nodeToBeRemapped.next;
                temp.next = nodeToBeRemapped;
            }
        }
        if(++indexToBeRemapped == n) return nodeToBeRemapped.next;
        if(nodeToBeRemapped == currHead) return null;
        nodeToBeRemapped.next = nodeToBeRemapped.next.next;
        return head;
    }
    public ListNode removeNthFromEnd_LeetcodeBetterSolution(ListNode head, int n) { //Beats 99%/97%
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
