package com.labWeek6;
public class Date {

    private int day;

    private int month;

    private int year;

    public Date() {
        this.day = 01;
        this.month = 01;
        this.year = 2020;
    }
    public String dateConvert()
    {
        return (day + "/" + month + "/"+ year);
    }
    public Date(int x, int y, int z){
        this.day=x;
        this.month=y;
        this.year=z;
    }
    }




