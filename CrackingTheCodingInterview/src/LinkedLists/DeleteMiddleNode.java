package LinkedLists;

/**
 * Created by murugesm on 1/25/17.
 */
public class DeleteMiddleNode
{
    private static void deleteMiddle(Node middle)
    {
        middle.data = middle.next.data;
        middle.next = middle.next.next;
    }

    public static void main(String[] args)
    {
        Node list;
        list = Node.getList();
        Node.printList(list);
        deleteMiddle(Node.findMiddle(list, Node.findLength(list)));
        System.out.println("\nDeleted the node\n");
        Node.printList(list);
    }
}
