import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int number;
        do {
            System.out.println("Nhap so: ");
            number = sc.nextInt();
            tong += number;
        } while (tong <= 100);
        sc.close();
        System.out.println("Tong: " + tong);
    }
}