package Assignment_6;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {
    static void print2largest(Integer arr[], int arr_size)
    {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 1; i < arr_size; i++) {
            if (arr[i] != arr[0]) {
                System.out.printf("The second largest "
                                      + "element is %d\n",
                                  arr[i]);
                return;
            }
        }

        System.out.printf("There is no second "
                          + "largest element of array\n");
    }
    public static void main(String[] args)
    {
        Integer arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }


}
