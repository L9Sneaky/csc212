package tut1;

public class util {
	public static <T> int search(T[] data, int n, Condition<T> cond) {
		for (int i = 0; i < n; i++) {
			if (cond.test(data[1]))
				return i;
		}
		return -1;
	}

	public static <T> int searchEven(T[] data, int n) {
		try {
			SE ec = new SE();
			return util.search(data, n, ec);
		} catch (Exception e) {
			return -1;
		}
	}

	public static void reverseArray(int data[], int l, int r) {
		if (l >= r)
			return;
		int temp = data[l];
		data[l] = data[r];
		data[r] = temp;
		reverseArray(data, l + 1, r - 1);
	}

	public static void SelectionSort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void BubbleSort(int arr[], int n) {
		int temp;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
	}

	public static void ISR(int arr[], int n) {
		if (n <= 1)
			return;
		ISR(arr, n - 1);
		int last = arr[n - 1];
		int j = n - 2;
		while (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
	}

	public static <T> void swap(T a, T b) {
		T temp = a;
		a = b;
		b = temp;
	}

	public static <E> void printArray(int[] num) {
		// Display array elements
		for (int element : num) {
			System.out.printf("%s ", element);
		}
		System.out.println();

	}
}
