/**
 * Created by manikandan5 on 1/22/17.
 */
public class ReplaceSpaces
{
    private static String replaceSpace(String s)
    {
        int numSpaces = s.length() - s.replace(" ","").length();
        char[] result = new char[s.length() + numSpaces*2];
        for(int i=0; i < s.length(); i++)
        {
            result[i] = s.charAt(i);
        }

        int j = s.length()-1;
        for(int i = result.length-1; i >= 0; i--, j--)
        {
            if(result[j] != ' ')
            {
                result[i] = result[j];
            }
            else
            {
                result[i] = '0';
                result[i-1] = '2';
                result[i-2] = '%';
                i = i - 2;
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args)
    {
        System.out.println(replaceSpace("Mr John Smith"));
    }
}
