
public class ArrayOperation {

	int arr[];// primitive => 0
	// Integer arr[] // non primitive => null

	public ArrayOperation(int size) {
		arr = new int[size];
	}

//	void display() {
//		System.out.println("Elements in the Array : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}

	void display() {
		System.out.println("\nArray Data: ");
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	void insert(int data, int location) {
		for (int i = arr.length - 1; i >= location; i--) {
			arr[i] = arr[i - 1];
		}
		arr[location - 1] = data;

	}

	public static void main(String[] args) {

		ArrayOperation array = new ArrayOperation(5);
		array.display();// ?
		array.insert(10, 1);
		array.display();
		array.insert(20, 2);
		array.display();
		array.insert(-10, 1);
		array.display();
		array.insert(50, 4);
		array.display();
		array.insert(100, 2);
		array.display();

	}
}
