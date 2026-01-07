import java.util.Scanner;

public class ArrayDemo {

	int arr[] ;

	public ArrayDemo(int size) {
		arr = new int[size];
	}
	
	void input() {
		Scanner scr = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value : ");
			arr[i] = scr.nextInt();// 0 1 2 3 4 =>
		}
	}

	void display() {
		System.out.println("Elements in the Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {

		ArrayDemo array = new ArrayDemo(5);
		array.input();
		array.display();
		
		// System.out.println(arr[6]);// no compilation error
	}
}
