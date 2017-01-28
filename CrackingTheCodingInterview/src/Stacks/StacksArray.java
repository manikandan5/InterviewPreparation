package Stacks;

public class StacksArray
{
    int[] data;
    int top;

    public StacksArray()
    {
        this.data = new int[10];
        this.top = 0;
    }

    public void push(int data)
    {
        this.data[top] = data;
        this.top += 1;
    }

    public int pop()
    {
        this.top -= 1;
        return this.data[top];
    }

    public static void main(String[] args)
    {
        StacksArray stack = new StacksArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
    }
}
