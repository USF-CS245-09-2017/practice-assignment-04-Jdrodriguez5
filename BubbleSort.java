
public class BubbleSort implements SortingAlgorithm
{
    public void sort(int[] a)
    {
        for(int i = 0; i < a.length-1; i++)
            for(int j = 0; j < a.length-1; j++)
                if(a[j] > a[j+1]) // if the first number is bigger it calls the swap method
                {
                    swap(a, j, j+1);
                }

    }

    public void swap(int[] a, int i, int j)
    {
        int temp = a[i]; // swaps the 2 numbers 
        a[i] = a[j];
        a[j] = temp;
    }
}
