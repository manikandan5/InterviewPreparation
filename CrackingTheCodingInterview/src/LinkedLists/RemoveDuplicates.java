package LinkedLists;

import java.util.HashSet;

/**
 * Created by murugesm on 1/23/17.
 */
public class RemoveDuplicates
{
    private static Node removeDuplicates(Node node)
    {
        HashSet<Integer> setOfNum = new HashSet<>();
        Node head = node;
        Node prev = node;
        setOfNum.add(node.data);
        node = node.next;
        while (node != null)
        {
            if(setOfNum.contains(node.data))
            {
                if(node.next != null)
                {
                    prev.next = node.next;
                    node = node.next;
                }
                else
                {
                    prev.next = null;
                    break;
                }
            }
            else
            {
                setOfNum.add(node.data);
                prev = prev.next;
                node = node.next;
            }

        }
        return head;
    }

    private static Node removeDuplicatesWithoutBuffer(Node node)
    {
        Node head = node;
        Node curr = node;
        Node iterp;
        Node iterc;

        while(curr.next != null)
        {
            iterp = curr;
            iterc = curr.next;
            while (iterc != null)
            {
                if(iterc.data == curr.data)
                {
                    iterp.next = iterc.next;
                    iterc = iterc.next;
                }
                else
                {
                    iterp = iterp.next;
                    iterc = iterc.next;
                }
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args)
    {
        Node list;
        list = Node.getList();
        Node.printList(list);
        Node.printList(removeDuplicates(list));
        Node.printList(removeDuplicatesWithoutBuffer(list));
    }
}
