package ArraysAndStrings;

import java.util.HashSet;

/**
 * Created by manikandan5 on 1/21/17.
 */
public class UniqueCharactersInStrings
{
    //Function checks if the string contains unique characters or not
    private static boolean isUnique(String s1)
    {
        HashSet<Character> charSet = new HashSet<>();

        for(char s: s1.toCharArray())
        {
            if(charSet.contains(s))
            {
                return false;
            }
            else
            {
                charSet.add(s);
            }
        }

        return true;
    }

    //Function checks if the string contains unique characters or not without using any additional data structures
    private static boolean isUniqueNoDS(String s1)
    {
        for(int i=0; i < s1.length(); i++)
        {
            for(int j=i+1; j < s1.length(); j++ )
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }

    //Function checks if the string contains unique characters or not using only native DS
    private static boolean isUniqueNativeDS(String s1)
    {
        boolean[] charArray = new boolean[128];

        for(char ch: s1.toCharArray())
        {
            if(!charArray[(int) ch])
            {
                charArray[(int) ch] = true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(isUnique("unique"));
        System.out.println(isUniqueNoDS("string"));
        System.out.println(isUniqueNativeDS("check"));
    }
}
