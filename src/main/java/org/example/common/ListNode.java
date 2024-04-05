package org.example.common;

import java.util.Arrays;

public class ListNode {
  int val;
  public ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  // 数组转链表
  public static ListNode toLinkedList(int[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }
    ListNode head = new ListNode(arr[0]);
    ListNode cur = head;
    for (int i = 1; i < arr.length; i++) {
      cur.next = new ListNode(arr[i]);
      cur = cur.next;
    }
    return head;
  }

  // 链表转数组
  public static int[] toArray(ListNode head) {
    if (head == null) {
      return new int[0];
    }
    int[] arr = new int[length(head)];
    int i = 0;
    ListNode cur = head;
    while (cur != null) {
      arr[i++] = cur.val;
      cur = cur.next;
    }
    return arr;
  }

  @Override
  public String toString() {
    return Arrays.toString(toArray(this));
  }

  // 获取链表长度
  private static int length(ListNode head) {
    int len = 0;
    ListNode cur = head;
    while (cur != null) {
      len++;
      cur = cur.next;
    }
    return len;
  }
}
