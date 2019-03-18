package day02;

//用Java语言编写一个程序，判断一个年份是否是闰年

import java.util.Scanner;

public class LeapYear {
    public int getYear() {
        int year;
        Scanner in = new Scanner (System.in );
        System.out.println("please input a year");
        year = in.nextInt();
        return year;
    }
}

class Read{
    public static void main(String[] args) {
        int i;
        LeapYear y = new LeapYear();
        i = y.getYear();
        if ((i % 400 == 0) || (i % 4 == 0 && i % 400 != 0)) {
            System.out.println("The year is leap year!");
        }else    System.out.println("The year is not leap year!");
    }
}
