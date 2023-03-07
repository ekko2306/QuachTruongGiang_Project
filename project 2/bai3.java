import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap ten");
        String s = sc.nextLine();
        System.out.println("vui long nhap tuoi");
		int a = sc.nextInt();

        if (a < 16) 
    		System.out.println("Ban " + s + " o do tuoi vi thanh nien");
		if (a >= 16 && a < 18) 
    		System.out.println("Ban " + s + " o do tuoi truong thanh");
		if (a >= 18) {
    		System.out.println("Ban " + s + " da gia");
		}
	}
}