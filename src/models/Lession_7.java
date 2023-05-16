package models;

import java.util.Scanner;

/**
 * Lession_7
 */
public class Lession_7 {
    public int num;

    public Lession_7(int num) {
        this.num = num;
    }

    public Lession_7() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 số number");
        this.num = sc.nextInt();

        int abs;

        if (num >= 0) {
            abs = num;
        } else {
            abs = -num;
        }
        System.out.println("Giá trị tuyệt đối của num là " + abs);
    }
}