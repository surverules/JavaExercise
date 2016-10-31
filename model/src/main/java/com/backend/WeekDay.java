package com.backend;

/**
 * Created by surverules on 10/30/2016.
 */
public enum WeekDay {
    JANUARY(30, 2016),
    FEBRUARY(28, 2016),
    MARCH(30,2016),
    APRIL(30,2016),
    MAY(31,2016),
    JUNE(30,2016),
    JULY(31,2016),
    AUGUST(30,2016),
    SEPTEMBER(30,2016),
    OCTOBER(31,2016),
    NOVEMBER(30,2016),
    DECEMBER(31,2016);

    int day;
    int year;
    WeekDay(int day, int year){
        this.day = day;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}
