package models;

import java.util.Scanner;

public class Lession_6 {
    public int aPersion;
    public int bPersion;
    public int cPersion;

    public Lession_6() {
    }

    public Lession_6(int aPersion, int bPersion, int cPersion) {
        this.aPersion = aPersion;
        this.bPersion = bPersion;
        this.cPersion = cPersion;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số tuổi của ông A");
        this.aPersion = sc.nextInt();

        System.out.println("Nhập số tuổi của ông B");
        this.bPersion = sc.nextInt();

        System.out.println("Nhập số tuổi của ông C");
        this.cPersion = sc.nextInt();

        // Xác định người lớn tuổi nhất
        int maxAge = aPersion;
        if (bPersion > maxAge) {
            maxAge = bPersion;
        }
        if (cPersion > maxAge) {
            maxAge = cPersion;
        }

        // Xác định người trẻ nhất
        int minAge = aPersion;
        if (bPersion < minAge) {
            minAge = bPersion;
        }
        if (cPersion < minAge) {
            minAge = cPersion;
        }

        System.out.println("Người lớn tuổi nhất là " + maxAge +" tuổi");
        System.out.println("Người trẻ tuổi nhất là " + minAge +" tuổi");
    }

}
