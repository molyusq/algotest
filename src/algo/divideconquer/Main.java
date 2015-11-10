package algo.divideconquer;

import algo.sort.InversionCounter;
import algo.sort.QuickSort;

import java.io.IOException;
import java.util.Arrays;

public class Main {


    private static void testInversionCounter() throws IOException {
        long time = System.currentTimeMillis();
        int[] bigArray = TextFileReader.read("src/IntegerArray.txt");
        int[] copyOfBigArray = Arrays.copyOf(bigArray, bigArray.length);
        System.out.println("divide & conquer: " + new InversionCounter().count(bigArray));
        System.out.println("runtime: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        System.out.println("simple: " + new InversionCounter().countInversionsInBruteForceWay(copyOfBigArray));
        System.out.println("runtime: " + (System.currentTimeMillis() - time));
        System.out.println("*************");
    }

    private static void testQuicksort() throws  IOException{
        long time = System.currentTimeMillis();
        int[] bigArray = TextFileReader.read("src/QuickSort.txt");
        int[] testArray = new int[] {5,2,1,3,4,7,8,10,6,11,9};
        System.out.println("count of comparisons: " + new QuickSort(bigArray).sort(0, bigArray.length));
        System.out.println("runtime: " + (System.currentTimeMillis() - time));
//        System.out.println(Arrays.toString(testArray));
        System.out.println("*************");
    }

    public static void main(String[] args) throws IOException {
        //testInversionCounter();
        testQuicksort();
    }
}
