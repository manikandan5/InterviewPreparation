package LinkedLists;

/**
 * Created by manikandan5 on 1/27/17.
 */
public class SumOfNumbers
{
    private static Node findSum(Node num1, Node num2)
    {
        Node resultHead=null;
        Node result=null;
        int tempSum;
        boolean carry = false;

        while(num1 != null && num2 != null)
        {
            if(carry)
            {
                tempSum = num1.data + num2.data + 1;
            }
            else
            {
                tempSum = num1.data + num2.data;
            }
            if(tempSum >= 10)
            {
                carry = true;
            }
            else
            {
                carry = false;
            }
            Node tempNode = new Node(tempSum%10);
            if (resultHead == null)
            {
                resultHead = tempNode;
                result = tempNode;
                result.next = null;
            }
            else
            {
                result.next = tempNode;
                result = result.next;
                result.next = null;
            }
            num1 = num1.next;
            num2 = num2.next;
        }
        if((carry) && (num1 == null) && (num2 == null))
        {
            Node tempNode = new Node(1);
            result.next = tempNode;
            tempNode.next = null;
        }
        else if((carry) && (num1 == null))
        {
            result.next = num2;
            num2.data += 1;
        }
        else if((carry) && (num2 == null))
        {
            result.next = num1;
            num1.data += 1;
        }
        else if(num1 == null)
        {
            result.next = num2;
        }
        else if(num2 == null)
        {
            result.next = num1;
        }
        return resultHead;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the first number:");
        Node num1;
        num1 = Node.getList();
        System.out.println("Enter the second number:");
        Node num2;
        num2 = Node.getList();
        System.out.print("The sum of two numbers are: ");
        Node.printList(findSum(num1,num2));
    }
}
