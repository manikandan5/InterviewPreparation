package Stacks;

/**
 * Created by manikandan on 3/6/17.
 */
public class TowersOfHanoi
{
    public static Stack tower1 = new Stack();
    public static Stack tower2 = new Stack();
    public static Stack tower3 = new Stack();

    private static void moveTo(int data, char from, char inter, char to)
    {
        if(data == 1)
        {
            System.out.println("Disk "+Integer.toString(data)+" moved from "+ from+ " to "+ to);
        }
        else
        {
            moveTo(data-1, from, to, inter);
            System.out.println("Disk "+Integer.toString(data)+" moved from "+ from+ " to "+ to);
            moveTo(data-1, inter, from, to);
        }
    }

    public static void main(String[] args)
    {
        moveTo(4, 'A', 'B', 'C');
    }
}
