package org.example.solution;

import org.example.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution19 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    List<ListNode> listNodes = new ArrayList<>();
    while (head != null) {
      listNodes.add(head);
      head = head.next;
    }

    listNodes.remove(listNodes.size() - n);
    if (listNodes.isEmpty()) {
      return null;
    }
    if (listNodes.size() == 1) {
      listNodes.get(0).next = null;
    }
    for (int i = 0; i < listNodes.size(); i++) {
      if (i == listNodes.size() - 1) {
        listNodes.get(i).next = null;
        continue;
      }
      listNodes.get(i).next = listNodes.get(i + 1);
    }
    return listNodes.get(0);
  }
}
