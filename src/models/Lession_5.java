package models;

import java.util.Scanner;

public class Lession_5 {
    public int score;

    public Lession_5() {
    }

    public Lession_5(int score) {
        this.score = score;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số điểm của sinh viên");
        this.score = sc.nextInt();

        if (score <= 25) {
            System.out.println("F");
        } else if (score <= 45 ) {
            System.out.println("E");
        } else if (score <= 50 ) {
            System.out.println("D");
        } else if (score <= 60 ) {
            System.out.println("C");
        } else if (score <= 80 ) {
            System.out.println("B");
        } else if ( 80 < score) {
            System.out.println("A");
        }
    }
}
