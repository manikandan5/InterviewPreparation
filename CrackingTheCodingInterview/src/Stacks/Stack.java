package Stacks;

import java.util.ArrayList;

class Node
{
    Node next;
    int data;

    public Node(int data)
    {
        this.data = data;
    }
}

public class Stack
{
    private Node top;

    //Insert the element to the top of the stack
    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = this.top;
        this.top = newNode;
    }

    //Return the top most element of the stack
    public Node pop()
    {
        if(this.top == null)
        {
            return null;
        }
        Node currNode = top;
        this.top = top.next;
        currNode.next = null;
        return currNode;
    }

    //Similar to emptying the stack
    public void popAll()
    {
        while(top != null)
        {
            System.out.println(top.data);
            top = top.next;
        }
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();

        //Manually Loading data to test
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //Popping all the values from the stack
        Node curr = stack.pop();
        System.out.println(curr.data);
        curr = stack.pop();
        System.out.println(curr.data);
        curr = stack.pop();
        System.out.println(curr.data);
        curr = stack.pop();
        System.out.println(curr.data);
    }
}
