package models;

import java.util.Scanner;

public class Lession_10 {
    public int num;

    public Lession_10() {
    }

    public Lession_10(int num) {
        this.num = num;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 số có 4 chữ số");
        this.num = sc.nextInt();

        int digit1 = num % 10; // 4
        int digit2 = (num / 10) % 10; // 3
        int digit3 = (num / 100) % 10; // 2
        int digit4 = (num / 1000) % 10; // 1

        int reversedNum = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;

        System.out.println("Số mới sau khi đảo ngược: " + reversedNum);

    }
}
