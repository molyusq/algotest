package algo.divideconquer;

import java.util.Arrays;

/**
 * Created by andrew on 10/26/15.
 */
public class InversionCounter {

    public long count(int[] array) {
        if(array.length == 1)
            return 0;
        long left, right, split;
        int[] leftArray = Arrays.copyOfRange(array, 0, array.length/2),
                rightArray = Arrays.copyOfRange(array, array.length / 2, array.length);
        left = count(leftArray);
        right = count(rightArray);
        split = countSplit(array, leftArray, rightArray);
        return left + right + split;
    }

    public long countSplit(int[] array, int[] left, int[] right) {
        int i = 0, j = 0;
        long count = 0;
        for(int k=0; k < array.length; k++) {
            if(i == left.length) {
                array[k] = right[j];
                j++;
            } else if(j == right.length) {
                array[k] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                count += left.length - i;
                j++;
            }
        }
        return count;
    }

    public long countInversionsInBruteForceWay(int[] array) {
        long count = 0;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j])
                    count++;
            }
        }
        return count;
    }
}
