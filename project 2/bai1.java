import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	    int b = sc.nextInt();
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		System.out.println("\n*****So sanh 2 so*****");
		if (a > b) {
    		System.out.println("\t" + a + " > " + b);
		} else if (a < b) {
    		System.out.println("\t" + a + " < " + b);
		} else {
    		System.out.println("\t" + a + " = " + b);
		}
	}
}