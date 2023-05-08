package models;

import java.util.Scanner;

/**
 * Lession_4
 */
public class Lession_4 {

    public int yearNumber;
    public double salary;

    public Lession_4() {
    }

    public Lession_4(int yearNumber, double salary) {
        this.yearNumber = yearNumber;
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số năm làm việc");
        this.yearNumber = sc.nextInt();

        System.out.println("Nhập số lương hàng tháng của bạn");
        this.salary = sc.nextDouble();

        double bonus;
        if (yearNumber >= 5) {
            bonus = salary * 0.05;
            System.out.println("Bonus trên 5 năm của bạn là : " + bonus);
        } else {
            System.out.println("Bạn không được nhận bonus");
        }
    }

}