package models;

import java.util.Scanner;

/**
 * Lession_1
 */
public class Lession_1 {
    public int a;
    public int b;

    public Lession_1() {
    }

    public Lession_1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giá trị a");
        this.a = sc.nextInt();

        System.out.println("Nhập giá trị b");
        this.b = sc.nextInt();

        if (a == b) {
            System.out.println("Đây là hình vuông");
        } else {
            System.out.println("Đây không phải là hình vuông");
        }
    }

}