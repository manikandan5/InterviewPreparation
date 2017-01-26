package LinkedLists;

/**
 * Created by murugesm on 1/25/17.
 */
public class FindKthElement
{
    private static void findKthElement(Node head, int k)
    {
        int count = 1;
        while(head != null && count < k)
        {
            if(head.next != null)
            {
                head = head.next;
            }
            else
            {
                System.out.println("K is greater than the length of the Linked List");
                return;
            }
            count++;
        }
        System.out.println("Kth element in the linked list is: ");
        System.out.println(head.data);
    }

    private static void findKthToLast(Node head, int k)
    {
        Node iter1 = head;
        Node iter2 = head;
        for(int i = 0; i < k ; i++)
        {
            if(iter2 == null)
            {
                System.out.println("K less than the size of the Linked List");
                return;
            }
            iter2 = iter2.next;
        }
        while(iter2 != null)
        {
            iter1 = iter1.next;
            iter2 = iter2.next;
        }
        System.out.println("Kth element from the last in the Linked List is");
        System.out.println(iter1.data);
    }

    private static int findKthToLastRecur(Node head, int k)
    {
        if(head == null)
        {
            return 0;
        }
        int i = findKthToLastRecur(head.next, k) + 1;

        if(i==k)
        {
            System.out.println("Kth element from the last in the Linked List is");
            System.out.println(head.data);
        }
        return i;
    }

    public static void main(String[] args)
    {
        Node list;
        list = Node.getList();
        Node.printList(list);
        findKthElement(list, 3);
        findKthToLast(list, 3);
        findKthToLastRecur(list, 3);
    }
}
