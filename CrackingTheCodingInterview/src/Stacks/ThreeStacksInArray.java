package Stacks;

public class ThreeStacksInArray
{
    int[] data;
    int top1;
    int top2;
    int top3;

    public ThreeStacksInArray()
    {
        this.data = new int[100];
        this.top1 = 0;
        this.top2 = 0;
        this.top3 = 0;
    }

    public void pushIntoStack1(int data)
    {
        this.data[this.top1] = data;
        this.top1 += 1;
        this.top2 += 1;
        this.top3 += 1;
        for(int i = this.top3-1; i >this.top1-1; i--)
        {
            this.data[i] = this.data[i-1];
        }
    }

    public void pushIntoStack2(int data)
    {
        this.data[this.top2] = data;
        this.top2 += 1;
        this.top3 += 1;
        for(int i = this.top3-1; i >this.top2-1; i--)
        {
            this.data[i] = this.data[i-1];
        }
    }

    public void pushIntoStack3(int data)
    {
        this.data[this.top3] = data;
        this.top3 += 1;
    }

    public int popStack1()
    {
        if(this.top1 == 0)
        {
            System.out.print("Stack 1 is empty\t");
            return 0;
        }
        this.top1 -= 1;
        this.top2 -= 1;
        this.top3 -= 1;
        int temp = this.data[this.top1];
        for(int i=this.top1; i < this.top3; i++)
        {
            this.data[i] = this.data[i+1];
        }
        System.out.print("Popping element from Stack 1\t:");
        return temp;
    }

    public int popStack2()
    {
        if(this.top2 == this.top1)
        {
            System.out.print("Stack 2 is empty\t");
            return 0;
        }
        this.top2 -= 1;
        this.top3 -= 1;
        int temp = this.data[this.top2];
        for(int i=this.top2; i < this.top3; i++)
        {
            this.data[i] = this.data[i+1];
        }
        System.out.print("Popping element from Stack 2\t:");
        return temp;
    }

    public int popStack3()
    {
        if(this.top3 == this.top2)
        {
            System.out.print("Stack 3 is empty\t");
            return 0;
        }
        this.top3 -= 1;
        System.out.print("Popping element from Stack 3\t:");
        return this.data[this.top3];
    }

    public static void main(String[] args)
    {
        ThreeStacksInArray arrays = new ThreeStacksInArray();

        arrays.pushIntoStack1(1);
        arrays.pushIntoStack1(2);
        arrays.pushIntoStack1(3);
        arrays.pushIntoStack2(4);
        System.out.println(arrays.popStack1());
        System.out.println(arrays.popStack2());
        System.out.println(arrays.popStack1());
        arrays.pushIntoStack1(3);
        System.out.println(arrays.popStack1());
        arrays.pushIntoStack3(3);
        arrays.pushIntoStack1(3);
        System.out.println(arrays.popStack3());
    }
}
