
package quicksort;
import java.util.*;

public class QuickSort 
{
    public static int[] sort(int [] numbers)
    {
        int size = numbers.length;
        quicksort(numbers,0,size-1);
        return numbers;
    }
    
    public static void  quicksort(int[] numbers,int first, int last)
    {
        if(first<last)
        {
        int p = partition(numbers, first, last);
        quicksort(numbers,first,p-1);
        quicksort(numbers,p+1,last);
        }
    }
    
    public static int partition(int[] numbers, int first, int last)
    {
        Random x = new Random();
        int p = first + x.nextInt(last-first+1);
        swap(numbers,first,p);
        p = first;
        int i;
        for  (i=p+1;i<=last;i++)
        {
            if(numbers[i]<numbers[p])
            {
                swap(numbers,i,p+1);
                swap(numbers,p,p+1);
                p++;
            }
        }
        return p;
    }
    
    public static void swap(int[] numbers, int x, int y)
    {
        int temp = numbers[x];
        numbers[x] = numbers[y];
        numbers[y] = temp;
    }

    
    
    public static void main(String[] args) 
    {
       int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
       int[] sortedNumbers;
       sortedNumbers = sort(randomNumbers); 
       System.out.println(Arrays.toString(sortedNumbers));
        
        
    }
    
}
