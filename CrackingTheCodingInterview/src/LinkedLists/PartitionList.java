package LinkedLists;

/**
 * Created by manikandan5 on 1/25/17.
 */
public class PartitionList
{
    private static Node partitionList(Node list, Node k)
    {
        Node list1 = null;
        Node list1Traversal = null;
        Node list2 = null;
        Node list2Traversal = null;
        Node curr= list;
        while (curr != null)
        {
            if(curr.data < k.data)
            {
                if(list1 == null)
                {
                    list1 = curr;
                    curr = curr.next;
                    list1.next = null;
                    list1Traversal = list1;
                }
                else
                {
                    list1Traversal.next = curr;
                    curr = curr.next;
                    list1Traversal = list1Traversal.next;
                    list1Traversal.next = null;
                }
            }
            else if(curr.data > k.data)
            {
                if(list2 == null)
                {
                    list2 = curr;
                    curr = curr.next;
                    list2.next = null;
                    list2Traversal = list2;
                }
                else
                {
                    list2Traversal.next = curr;
                    curr = curr.next;
                    list2Traversal = list2Traversal.next;
                    list2Traversal.next = null;
                }
            }
            else
            {
                curr = curr.next;
            }
        }
        list1Traversal.next = k;
        k.next = list2;
        return list1;
    }

    //Program sorts based on the middle element in the list. But could be modified by changing the node in the second argument in the function partitionList()
    public static void main(String[] args)
    {
        Node list;
        list = Node.getList();
        Node.printList(list);
        Node.printList(partitionList(list,Node.findMiddle(list,Node.findLength(list))));
    }
}
