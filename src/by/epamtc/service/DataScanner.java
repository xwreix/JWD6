package by.epamtc.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataScanner {
    public static int[] rangeFromFile(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        int[] dataArray = new int[2];
        int i = 0;
        while (scan.hasNextInt()) {
            dataArray[i] = scan.nextInt();
            i++;
        }
        return dataArray;
    }
}
