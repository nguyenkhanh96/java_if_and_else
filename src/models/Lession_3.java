package models;

import java.util.Scanner;

public class Lession_3 {
    public int quantity;

    public Lession_3() {
    }

    public Lession_3(int quantity) {
        this.quantity = quantity;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng sản phẩm bạn muốn mua");
        this.quantity = sc.nextInt();

        double price = quantity * 100;
        if (quantity >= 1000) {
            price = price * 0.9;
        }
        System.out.println("Tổng tiền trả là : " + price);
    }

}
