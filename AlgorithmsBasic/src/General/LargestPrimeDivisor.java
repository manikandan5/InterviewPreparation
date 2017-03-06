package General;

import java.math.BigInteger;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * Created by manikandan on 3/2/17.
 */
public class LargestPrimeDivisor
{
    public static int findLargestPrimeDivisor(long n)
    {
        int div = 2, maxDiv=0;
        while(n > 1)
        {
            if(n % div == 0)
            {
                while(n % div == 0 )
                {
                    n = n/div;
                }
                maxDiv = div;
            }
            div++;
        }
        return maxDiv;
    }
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        long num = 1500450271;
        System.out.println(findLargestPrimeDivisor(num));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time taken "+Double.toString(duration/ 1000000000.0));
    }
}
