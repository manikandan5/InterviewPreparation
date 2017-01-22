import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by manikandan5 on 1/22/17.
 */
public class StringPermutation
{
    private static boolean isPermutation(String str1, String str2)
    {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        if (s1.length != s2.length)
        {
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(isPermutation("dog","god"));
    }
}
