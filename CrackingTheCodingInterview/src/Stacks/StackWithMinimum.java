package Stacks;

class tempNode
{
    int data;
    int min;
    tempNode next;
}

public class StackWithMinimum
{
    tempNode top;

    public StackWithMinimum()
    {
        this.top = null;
    }

    public void push(int data)
    {
        tempNode temp = new tempNode();
        temp.data = data;
        if(top == null)
        {
            top = temp;
            top.min = data;
        }
        else
        {
            if(top.min < temp.data)
            {
                temp.min = top.min;
            }
            else
            {
                temp.min = temp.data;
            }
            temp.next = top;
            top = temp;
        }
    }

    public int pop()
    {
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek()
    {
        return top.data;
    }

    public int min()
    {
        return top.min;
    }

    public static void main(String[] args)
    {
        StackWithMinimum stack = new StackWithMinimum();
        stack.push(5);
        System.out.println(stack.min());
        stack.push(10);
        System.out.println(stack.min());
        stack.push(1);
        System.out.println(stack.min());
        int data = stack.pop();
        System.out.println(stack.min());
        data = stack.pop();
        System.out.println(stack.min());
    }
}