package org.example.Solution;

import cn.hutool.core.lang.Console;
import junit.framework.TestCase;
import org.example.common.ListNode;
import org.example.solution.Solution24;

public class Solution24Test extends TestCase {
  public void test() {
    Solution24 solution24 = new Solution24();
    ListNode listNode = ListNode.toLinkedList(new int[] {1, 2, 3, 4, 5});
    ListNode result = solution24.swapPairs(listNode);
    Console.log(result);
  }
}
