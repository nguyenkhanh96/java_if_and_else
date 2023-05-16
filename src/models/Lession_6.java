package models;

import java.util.Scanner;

public class Lession_6 {
    public int aPerson;
    public int bPerson;
    public int cPerson;

    public Lession_6() {
    }

    public Lession_6(int aPerson, int bPerson, int cPerson) {
        this.aPerson = aPerson;
        this.bPerson = bPerson;
        this.cPerson = cPerson;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số tuổi của ông A");
        this.aPerson = sc.nextInt();

        System.out.println("Nhập số tuổi của ông B");
        this.bPerson = sc.nextInt();

        System.out.println("Nhập số tuổi của ông C");
        this.cPerson = sc.nextInt();

        // Xác định người lớn tuổi nhất
        int maxAge = aPerson;
        if (bPerson > maxAge) {
            maxAge = bPerson;
        }
        if (cPerson > maxAge) {
            maxAge = cPerson;
        }

        // Xác định người trẻ nhất
        int minAge = aPerson;
        if (bPerson < minAge) {
            minAge = bPerson;
        }
        if (cPerson < minAge) {
            minAge = cPerson;
        }

        System.out.println("Người lớn tuổi nhất là " + maxAge +" tuổi");
        System.out.println("Người trẻ tuổi nhất là " + minAge +" tuổi");
    }

}
