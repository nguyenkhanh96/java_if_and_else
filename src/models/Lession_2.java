package models;

import java.util.Scanner;

public class Lession_2 {
    public int a;
    public int b;

    public Lession_2() {
    }

    public Lession_2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giá trị a");
        this.a = sc.nextInt();

        System.out.println("Nhập giá trị b");
        this.b = sc.nextInt();

        if (a > b) {
            System.out.println("Giá trị lớn nhất là : " + a);
        } else if (a < b) {
            System.out.println("Giá trị lớn nhất là : " + b);
        } else {
            System.out.println("Giá trị của a và b bằng nhau");
        }
    }
}
