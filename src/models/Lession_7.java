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

        if (num >= 0) {
            System.out.println("giá trị tuyệt đối của number là " + num);
        } else {
            System.out.println("Giá trị tuyệt đối của num là " + (-num));
        }
    }
}