import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu: ");
        n = sc.nextInt();
        float sum = 0;
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap arr[" + i + "]=");
            arr[i] = sc.nextFloat();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Trung binh cong: " + sum/n);
    }
}
