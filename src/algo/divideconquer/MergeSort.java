package algo.divideconquer;

import java.util.Arrays;

/**
 * Created by andrew on 10/7/15.
 */
public class MergeSort {

    public static int[] sort(int [] array) {
        int[] arrayA = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] arrayB = Arrays.copyOfRange(array, array.length / 2, array.length);
        if(arrayA.length > 1)
            arrayA = sort(arrayA);
        if(arrayB.length > 1)
            arrayB = sort(arrayB);
        return merge(arrayA, arrayB);
    }

    private static int[] merge(int[] arrayA, int[] arrayB) {
        int i = 0, j = 0;
        int[] array= new int[arrayA.length + arrayB.length];
        for(int k=0; k < array.length; k++) {
            if(i == arrayA.length) {
                array[k] = arrayB[j];
                j++;
            } else if(j == arrayB.length) {
                array[k] = arrayA[i];
                i++;
            } else if (arrayA[i] < arrayB[j]) {
                array[k] = arrayA[i];
                i++;
            } else {
                array[k] = arrayB[j];
                j++;
            }
        }
        return array;
    }

}
