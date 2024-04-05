package org.example.Solution;

import cn.hutool.core.lang.Console;
import junit.framework.TestCase;
import org.example.common.ListNode;
import org.example.solution.Solution19;

public class Solution19Test extends TestCase {
  public void test() {
    Solution19 s = new Solution19();
    ListNode listNode = ListNode.toLinkedList(new int[] {1, 2, 3});
    ListNode result = s.removeNthFromEnd(listNode, 1);
    Console.log(result);
  }
}
