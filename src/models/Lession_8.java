package models;

public class Lession_8 {
    int x = 2;
    int y = 5;
    int z = 0;

    public Lession_8() {
    }

    public void input() {
        if (x == 2) {
            System.out.println("Giá trị là true");
        }
        if (x != 5) {
            System.out.println("Giá trị là true");
        }
        if (x != 5 && y >= 5) {
            System.out.println("Giá trị là true");
        }
        if (z != 0 || x == 2) {
            System.out.println("Giá trị là true");
        }
        if (!(y < 10)) {
            System.out.println("Giá trị là true");
        } else {
            System.out.println("Giá trị là faise");
        }
    }
}
