package org.example.solution;

import org.example.common.ListNode;

import java.util.ArrayList;

public class Solution24 {
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ArrayList<ListNode> arrayList = new ArrayList<>();
    while (head != null) {
      arrayList.add(head);
      head = head.next;
    }
    for (int i = 0; i < arrayList.size(); i = i + 2) {

      if (i + 1 <= arrayList.size() - 1) {
        ListNode leftOne = arrayList.get(i);
        ListNode rightOne = arrayList.get(i + 1);
        arrayList.set(i + 1, leftOne);
        arrayList.set(i, rightOne);
      }
    }
    for (int i = 0; i < arrayList.size(); i++) {
      if (i + 1 <= arrayList.size() - 1) {
        ListNode leftOne = arrayList.get(i);
        leftOne.next = arrayList.get(i + 1);
      } else {
        ListNode leftOne = arrayList.get(i);
        leftOne.next = null;
      }
    }
    return arrayList.get(0);
  }
}
