package ArraysAndStrings;

/**
 * Created by murugesm on 1/22/17.
 */
public class RotationCheck
{
    //Function to check if string s2 is a substring of s1
    private static boolean isSubstring(String s1, String s2)
    {
        if(s1.contains(s2))
        {
            return true;
        }
        return false;
    }

    private static boolean isRotation(String s1, String s2)
    {
        if((s1.length() == 0) || (s2.length() == 0) || (s1.length() != s2.length()))
        {
            return false;
        }
        else
        {
            return isSubstring(s1+s1, s2);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(isRotation("mani", "nima"));
    }
}
