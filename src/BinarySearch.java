
public class BinarySearch {

	static void binarySearch(int arr[], int search) {

		boolean found = false;
		int min, max, mid;

		min = 0;
		max = arr.length - 1;// 11

		while (min <= max) {
			mid = (min + max) / 2;
			System.out.println(min+" "+max+" => "+arr[mid]);

			if (arr[mid] == search) {
				found = true;
				break;
			} else if (search > arr[mid]) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}

		if (found) {
			System.out.println("Num found");
		} else {
			System.out.println("Num Not Found");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 10, 12, 15, 19, 25, 32, 45, 55, 77, 100, 120, 200 };

		int search = 205;

		binarySearch(arr, search);
	}

}
