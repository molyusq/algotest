package algo.divideconquer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andrew on 10/26/15.
 */
public class TextFileReader {
    public static int[] read(String filename) throws IOException {
        int[] array = new int[100000];
        Scanner scanner = new Scanner(new File(filename));
        int i = 0;
        while(scanner.hasNextInt())
            array[i++] = scanner.nextInt();
        return array;
    }
}
