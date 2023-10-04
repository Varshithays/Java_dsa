package varshitha;
import java.util.*;
public class Findsecondlargest
{
    // Java program to find second largest
// element in an array

        // Function to print the
// second largest elements
        static void print2largest(int arr[],
                                  int arr_size)
        {
            int i,second;
            int firstmax=0;
            for(i=0;i<arr_size;i++){
                if(arr[i]>firstmax)
                {
                    System.out.println(arr[i]);
                    firstmax=arr[i];
                    System.out.println(arr[i]);

                }
            }
            // Find the second largest element
            int secondmax=0;
            int temp = arr[0];
            arr[0] = firstmax;
            for (i = 1; i < arr_size; i++) {
                if (arr[i] > secondmax) {
                    secondmax = arr[i];
                }
            }


            System.out.println(firstmax+" second one is: "+secondmax);
        }

        // Driver code
        public static void main(String[] args)
        {
            int arr[] = {12, 35, 1, 10, 34, 1};
            int n = arr.length;
            print2largest(arr, n);
        }
    }

// This code is contributed by gauravrajput1


