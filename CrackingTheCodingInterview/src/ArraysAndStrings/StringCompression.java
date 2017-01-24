package ArraysAndStrings;

/**
 * Created by manikandan5 on 1/22/17.
 */
public class StringCompression
{
    private static String compressString(String s)
    {
        StringBuilder strBld = new StringBuilder();

        int count, j;

        for(int i=0; i < s.length() - 1; i++)
        {
            count = 1;
            j = i + 1;
            while(true)
            {
                if(s.charAt(i) != s.charAt(j))
                {
                    break;
                }
                count++;
                if(j < s.length() - 1)
                {
                    j++;
                }
                else
                {
                    break;
                }
            }
            i = j - 1;
            strBld.append(s.charAt(i));
            strBld.append(count);

        }

        if(s.charAt(s.length()-1) != s.charAt(s.length()-2))
        {
            strBld.append(s.charAt(s.length()-1));
            strBld.append('1');
        }

        if(strBld.length() > s.length())
        {
            return s;
        }
        return String.valueOf(strBld);
    }

    public static void main(String[] args)
    {
        System.out.println(compressString("abbbbbb"));
        System.out.println(compressString("aaaabbbb"));
    }
}
