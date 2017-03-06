import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * Created by manikandan on 3/2/17.
 */
public class Temp
{

}


class GFG
{
    public static void main (String[] args)
    {
        //code
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        int[] arr = new int[10];
        for(int i=0; i<testCount; i++)
        {
            for(int j=0; j<10; j++)
            {
                arr[i] = sc.nextInt();
                System.out.print(arr[j]);
            }
            System.out.println();
        }

    }
}