package LinkedLists;
import java.util.*;

/**
 * Created by murugesm on 1/23/17.
 */
public class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    public static Node getList()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = reader.nextLine();
        Integer num = Integer.parseInt(input);
        Node head = new Node(num);
        Node temp = head;
        while(true)
        {
            input = reader.nextLine();
            if(input.toLowerCase().equals("stop"))
                break;
            num = Integer.parseInt(input);
            Node newNode = new Node(num);
            temp.next = newNode;
            newNode.next = null;
            temp = newNode;
        }
        return head;
    }

    public static void printList(Node node)
    {
        System.out.println("The list is as follows:");
        while(node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
