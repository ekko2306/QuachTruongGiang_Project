import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int number = sc.nextInt();
        sc.close();
        int giaithua = 1;
        for (int i = number; i >= 1; i--) {
            giaithua *= i;
        }
        System.out.println("Giai thua: " + giaithua);
    }
}