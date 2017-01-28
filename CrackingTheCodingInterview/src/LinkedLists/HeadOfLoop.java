package LinkedLists;

/**
 * Created by manikandan5 on 1/27/17.
 */
public class HeadOfLoop
{
    //Creates a manual linked list with Node 5 as the start of the loop
    private static Node createLoopedList()
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(11);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;
        n11.next = n5;

        return n1;
    }

    private static Node findLoopStart(Node head)
    {
        Node slow = head.next;
        Node fast = head.next.next;

        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = head;

        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args)
    {
        Node head = createLoopedList();
        Node loopHead = findLoopStart(head);
        System.out.println(loopHead.data);
    }
}
