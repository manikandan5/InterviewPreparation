package General;

/**
 * Created by manikandan on 3/2/17.
 */
public class Prime
{
    private static boolean isPrime(int n)
    {
        if(n==2 || n== 3)
        {
            return true;
        }
        if((n % 2 == 0)||(n % 3 == 0))
        {
            return false;
        }
        for(int i=1; ((6*i)-1)<= Math.sqrt(n); i++)
        {
            if(((n%((6*i)-1))==0) || ((n%((6*i)+1))==0))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isPrime(31));
    }
}
