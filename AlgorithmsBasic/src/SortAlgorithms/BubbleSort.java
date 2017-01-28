package SortAlgorithms;

/**
 * Created by manikandan5 on 1/28/17.
 */
public class BubbleSort
{
    private static int[] doBubbleSort(int[] array)
    {
        for(int i=0; i < array.length; i++)
        {
            for(int j=0; j < i; j++)
            {
                if(array[j] > array[i])
                {
                    array[j] = array[j] + array[i];
                    array[i] = array[j] - array[i];
                    array[j] = array[j] - array[i];
                }
            }
        }
        return array;
    }

    public static void main(String[] args)
    {
        int[] array = {4,5,1,9,8,6,2,3,0,7,-2,0,2,3,2,1};
        int[] result = doBubbleSort(array);
        for(int i: result)
        {
            System.out.print(i);
            System.out.print("\t");
        }
    }
}
