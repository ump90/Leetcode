package org.example.common;

import cn.hutool.core.lang.Console;
import junit.framework.TestCase;

public class ListNodeTest extends TestCase {
    public void testListNode() {
        ListNode listNode = ListNode.toLinkedList(new int[]{1, 2, 3});
        Console.log(listNode);
    }

}
