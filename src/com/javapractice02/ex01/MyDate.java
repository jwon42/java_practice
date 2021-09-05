package com.javapractice02.ex01;

public class MyDate {
    // Property
    private int day;
    private int month;
    private int year;

    // Constructor
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    };

    // Method
    public boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidMonth(int month) {
        if ((month >= 1) && (month <= 12)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidDay(int day, int month, int year) {
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
            if ((day >= 1) && (day <= 31)) {
                return true;
            } else {
                return false;
            }
        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            if ((day >= 1) && (day <= 30)) {
                return true;
            } else {
                return false;
            }
        } else if (month == 2) {
            if (isLeapYear(year)) {
                if ((day >= 1) && (day <= 29)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if ((day >= 1 )&& (day <= 28)) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public String dateFormatToString() {
        return (this.year + "년 " + this.month + "월 " + this.day + "일");
    }

    public String isValid() {
        if (isValidYear(this.year) && isValidMonth(this.month) && isValidDay(this.day, this.month, this.year)) {
            return (dateFormatToString() + "은 유효한 날짜입니다.");
        } else {
            return (dateFormatToString() + "은 유효하지 않은 날짜입니다.");
        }
    }
}
