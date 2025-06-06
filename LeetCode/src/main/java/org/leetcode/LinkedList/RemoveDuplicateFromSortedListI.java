package org.leetcode.LinkedList;

public class RemoveDuplicateFromSortedListI {
    public ListNode deleteDuplicates(ListNode head) {
       ListNode previousNode = null;
       ListNode currentNode = head;

       while (currentNode != null) {
           ListNode tempNode = currentNode.next;
           currentNode.next = previousNode;
           previousNode = currentNode;
           currentNode = tempNode;
       }
       return previousNode;
    }
}
