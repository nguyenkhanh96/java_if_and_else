package models;

import java.util.Scanner;

public class Lession_9 {
    public int year;

    public Lession_9() {
    }

    public Lession_9(int year) {
        this.year = year;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập năm");
        this.year = sc.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }
    }
}
