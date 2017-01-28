/**
 * Created by manikandan5 on 1/28/17.
 */
public class InsertionSort
{
    private static int[] doInsertionSort(int[] array)
    {
        int j;
        for(int i=0; i < array.length; i++)
        {
            j=i;
            while(j>0 && array[j]<array[j-1])
            {
                array[j] = array[j] + array[j-1];
                array[j-1] = array[j] - array[j-1];
                array[j] = array[j] - array[j-1];
                j--;
            }
        }
        return array;
    }

    public static void main(String[] args)
    {
        int[] array = {4,5,1,9,8,6,2,3,0,7,-2,0,2,3,2,1};
        int[] result = doInsertionSort(array);
        for(int i: result)
        {
            System.out.print(i);
            System.out.print("\t");
        }
    }
}
