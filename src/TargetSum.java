
public class TargetSum {

	static int[] findSum(int arr[], int targetSum) {

		int x[] = new int[2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == targetSum) {
					System.out.println(i + " " + j);
					x[0] = i;
					x[1] = j;
					return x;
				}
			}
		}

		return x;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 10
		int targetSum = 11;

		findSum(arr, targetSum);

		System.out.println("THE END");
	}
}
