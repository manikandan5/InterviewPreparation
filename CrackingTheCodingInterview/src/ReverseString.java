/**
 * Created by manikandan5 on 1/22/17.
 */
public class ReverseString
{
    private static String reverse(String s1)
    {
        StringBuilder strBuild = new StringBuilder("");
        for(int i = s1.length()-1; i >= 0 ; i--)
        {
            strBuild.append(s1.charAt(i));
        }
        return strBuild.toString();
    }

    private static String reverse(char[] s1)
    {
        StringBuilder strBuild = new StringBuilder("");
        for(int i = s1.length-1; i >= 0 ; i--)
        {
            strBuild.append(s1[i]);
        }
        return strBuild.toString();
    }

    private static String reverseInPlace(String s1)
    {
        char[] charArray = s1.toCharArray();
        char temp;
        int length = charArray.length;
        for(int i = 0 ; i < length / 2 ; i++)
        {
            temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }
        return String.valueOf(charArray);
    }

    private static String reverseInPlace(char[] charArray)
    {
        char temp;
        int length = charArray.length;
        for(int i = 0 ; i < length / 2 ; i++)
        {
            temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args)
    {
        System.out.println(reverse("Manikandan"));
        System.out.println(reverse("Manikandan".toCharArray()));
        System.out.println(reverseInPlace("Manikandan"));
        System.out.println(reverseInPlace("Manikandan1".toCharArray()));
    }
}
