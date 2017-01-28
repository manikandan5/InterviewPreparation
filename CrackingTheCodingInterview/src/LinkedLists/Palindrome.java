package LinkedLists;

import java.util.Stack;

/**
 * Created by manikandan5 on 1/27/17.
 */
public class Palindrome
{
    private static boolean isPalindrome(Node head)
    {
        Stack<Integer> stack = new Stack<>();
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null)
        {
            slow = slow.next;
        }

        while (slow != null)
        {
            if( slow.data != stack.pop())
            {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Node list;
        list = Node.getList();
        Node.printList(list);
        System.out.println(isPalindrome(list));
    }
}
