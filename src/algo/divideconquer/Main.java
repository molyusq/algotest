package algo.divideconquer;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        long time = System.currentTimeMillis();
        int[] bigArray = TextFileReader.read();
        int[] copyOfBigArray = Arrays.copyOf(bigArray, bigArray.length);
        int[] testArray = new int[] {1,3,5,2};
        System.out.println("divide & conquer: " + new InversionCounter().count(bigArray));
        System.out.println("runtime: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        System.out.println("simple: " + new InversionCounter().countInversionsInBruteForceWay(copyOfBigArray));
        System.out.println("runtime: " + (System.currentTimeMillis() - time));
        System.out.println("*************");


    }
}
