package SortAlgorithms;

/**
 * Created by murugesm on 1/28/17.
 */
public class SelectionSort
{
    private static int[] doSelectionSort(int[] array)
    {
        int min;
        for(int i=0; i < array.length - 1; i++)
        {
            min = i;
            for(int j=i+1; j< array.length; j++)
            {
                if(array[j] < array[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                array[min] = array[min] + array[i];
                array[i] = array[min] - array[i];
                array[min] = array[min] - array[i];
            }
        }
        return array;
    }
    public static void main(String[] args)
    {
        int[] array = {4,5,1,9,8,6,2,3,0,7,-2,0,2,3,2,1};
        int[] result = doSelectionSort(array);
        for(int i: result)
        {
            System.out.print(i);
            System.out.print("\t");
        }
    }
}
