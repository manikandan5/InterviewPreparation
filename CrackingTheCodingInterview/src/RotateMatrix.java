/**
 * Created by murugesm on 1/23/17.
 */
// The way we visualise the matrix is upto interpretation. printArray() function prints it the way I have visualized. All the rotations happen according to that too.

public class RotateMatrix
{
    private static void printArray(int[][] array)
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

    private static int[][] rotateMatrix(int[][] array)
    {
        int[][] result = new int[array.length][array[0].length]; // We expect a square matrix though
        int matrixSize = array.length;
        for(int i = 0; i < matrixSize ; i++)
        {
            for(int j=0 ; j < matrixSize; j++)
            {
                result[j][matrixSize-1-i] = array[i][j];
            }
        }
        return result;
    }

    private static int[][] rotateMatrixAntiClockwise(int[][] array)
    {
        int[][] result = new int[array.length][array[0].length]; // We expect a square matrix though
        int matrixSize = array.length;
        for(int i = 0; i < matrixSize ; i++)
        {
            for(int j=0 ; j < matrixSize; j++)
            {
                result[matrixSize-1-i][j] = array[j][i];
            }
        }
        return result;
    }

    private static int[][] rotateMatrixInPlace(int[][] array)
    {
        int matrixSize = array.length;
        int temp;
        for(int i=0; i < matrixSize / 2; i++)
        {
            for(int j=i ; j < matrixSize - i - 1; j++)
            {
                temp = array[i][j];
                array[i][j] = array[matrixSize - j - 1][i];
                array[matrixSize - j - 1][i] = array[matrixSize - i - 1][matrixSize - j - 1];
                array[matrixSize - i - 1][matrixSize - j - 1] = array[j][matrixSize - i - 1];
                array[j][matrixSize - i - 1] = temp;
            }
        }
        return array;
    }

    private static int[][] rotateMatrixInPlaceAntiClockwise(int[][] array)
    {
        int matrixSize = array.length;
        int temp;
        for(int i=0; i < matrixSize / 2; i++)
        {
            for(int j=i ; j < matrixSize - i - 1; j++)
            {
                temp = array[i][j];
                array[i][j] = array[j][matrixSize - 1 - i];
                array[j][matrixSize - 1 - i] = array[matrixSize - i - 1][matrixSize - j - 1];
                array[matrixSize - i - 1][matrixSize - j - 1] = array[matrixSize - 1 - j][i];
                array[matrixSize - 1 - j][i] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args)
    {
        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("Clockwise 90 degree rotation");
        printArray(rotateMatrix(array1));
        System.out.println();

        System.out.println("Anti-clockwise 90 degree rotation");
        printArray(rotateMatrixAntiClockwise(array2));
        System.out.println();

        System.out.println("In-place clockwise 90 degree rotation");
        printArray(rotateMatrixInPlace(array1));
        System.out.println();

        System.out.println("In-place anti-clockwise 90 degree rotation");
        printArray(rotateMatrixInPlaceAntiClockwise(array2));
    }
}
