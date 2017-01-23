/**
 * Created by manikandan5 on 1/22/17.
 */
public class ResetRowColumn
{
    private static int[][] resetRow(int[][] array, int row)
    {
        for( int i = 0; i < array[0].length; i ++)
        {
            array[row][i] = 0;
        }
        return array;
    }

    private static int[][] resetColumn(int[][] array, int column)
    {
        for( int i = 0; i < array.length; i ++)
        {
            array[i][column] = 0;
        }
        return array;
    }

    private static int[][] reset(int[][] array)
    {
        try
        {
            int[][] resultArray = copyArray(array);
            for (int i = 0; i < array[0].length; i++)
            {
                for (int j = 0; j < array.length; j++)
                {
                    if (array[j][i] == 0)
                    {
                        resultArray = resetRow(resultArray, j);
                        resultArray = resetColumn(resultArray, i);
                    }
                }
            }
            return resultArray;
        }
        catch (Exception e)
        {
            System.out.println("Invalid array" + "\n" + e);
        }
        return array;
    }

    private static int[][] copyArray(int[][] array)
    {
        int[][] resultArray = new int[array.length][array[0].length];
        for(int j=0 ; j < array.length; j++)
        {
            for(int i = 0 ; i < array[0].length ; i++)
            {
                resultArray[j][i] = array[j][i];
            }
        }
        return resultArray;
    }

    private static void printArray(int[][] array)
    {
        try
        {
            for (int j = 0; j < array.length; j++)
            {
                for (int i = 0; i < array[0].length; i++)
                {
                    System.out.print(array[j][i]);
                    System.out.print("\t");
                }
                System.out.println();
            }
        }
        catch (Exception e)
        {

        }
    }

    public static void main(String[] args)
    {
        int[][] array= {{1,2},{2,4},{0,6}};
        printArray(reset(array));
    }
}
