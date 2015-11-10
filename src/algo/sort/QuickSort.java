package algo.sort;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by andrew on 11/6/15.
 */
public class QuickSort {

    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public int sort(int left, int right) {
        int length = array.length;
        if(length <= 1)
            return 0;
        int leftComparisons = 0, rightComparisons = 0;
        int pivot = left;
//        int pivot = length - 1;
//        int median = length % 2 == 1 ? length/2 : length/2 - 1;
//        int pivot = getMedianOfThree(array, left, median, right);
        if(left < right) {
            int partitionMark = makePartition(left, right);
            leftComparisons = sort(left, partitionMark - 1);
            rightComparisons = sort(partitionMark, right);
        }
        return leftComparisons + rightComparisons + length - 1;
    }

    private int getMedianOfThree(int first, int median, int last) {
        if(array[median] > array[first])
            if(array[median] > array[last])
                return last;
            else return median;
        else if(array[last] > array[first])
            return first;
        else return last;
    }

    private int choosePivot() {
        return new Random().nextInt(array.length - 1);
    }

    private int makePartition(int left, int right) {
        int pivot = array[left];
        int i = left + 1;
        for (int j = left + 1; j < right; j++) {
            if(array[j] < pivot) {
                swap(array, j, i);
                i++;
            }
        }
        swap(array, left, i - 1);
//        System.out.println(Arrays.toString(array));
        return i;
    }
    private void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
