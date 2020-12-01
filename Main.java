package com.labWeek6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Date newDate= new Date();
        String converted= newDate.dateConvert();
        System.out.println(converted);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day= scanner.nextInt();
        System.out.println(day);

        System.out.println("Enter the month: ");
        int month= scanner.nextInt();
        System.out.println(month);

        System.out.println("Enter the year: ");
        int year= scanner.nextInt();
        System.out.println(year);

        Date secondDate= new Date(day,month,year);
        String str= secondDate.dateConvert();
        System.out.println(str);


    }
}
