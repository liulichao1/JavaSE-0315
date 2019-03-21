package day04;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CheckedEXceptionTest {
    public static void main(String[] args) {

        try {
            m();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    private static void m() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input file path:");
        String filePath  = scanner.nextLine();

        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath,"rw");
//        受检异常       是难以避免的。
//        非受检异常     是程序的bug。
    }
}
