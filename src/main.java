import java.util.Scanner;

public class main {
	
	public void menu() {
		System.out.println("1. Additiom of two numbers");
		System.out.println("2. Subtraction of two numbers");
		System.out.println("3. Multiplication of two numbers");
		System.out.println("4. Exit");
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			addition();
			break;
		case 2:
			subtraction();
			break;
		case 3:
			multiplication();
			break;
		case 4:
			System.exit(0);
		
		default:
			System.out.println("Invalid choice");
		}
		
	}
	

	private void multiplication() {
		
		System.out.println("Enter the real part of the first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the imaginary part of the first number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the real part of the second number: ");
		int num3 = sc.nextInt();
		System.out.println("Enter the imaginary part of the second number: ");
		int num4 = sc.nextInt();
		int real = num1 * num3 - num2 * num4;
		int imaginary = num1 * num4 + num2 * num3;
		System.out.println("The result of the multiplication is: " + real + " + " + imaginary + "i");
		menu();
		
	}


	private void subtraction() {
		
		System.out.println("Enter the real part of the first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the imaginary part of the first number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the real part of the second number: ");
		int num3 = sc.nextInt();
		System.out.println("Enter the imaginary part of the second number: ");
		int num4 = sc.nextInt();
		int real = num1 - num3;
		int imaginary = num2 - num4;
		System.out.println("The result of the subtraction is: " + real + " + " + imaginary + "i");
		menu();
	}


	private void addition() {
		
		System.out.println("Enter the real part of the first number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the imaginary part of the first number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the real part of the second number: ");
		int num3 = sc.nextInt();
		System.out.println("Enter the imaginary part of the second number: ");
		int num4 = sc.nextInt();
		int real = num1 + num3;
		int imaginary = num2 + num4;
		System.out.println("The result of the addition is: " + real + " + " + imaginary + "i");
		menu();
	}


	public static void main(String[] args) {
		
		//Ex 1
		main obj = new main();
		obj.menu();
		
		
	}
	
}
