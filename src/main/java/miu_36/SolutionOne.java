package miu_36;

public class SolutionOne {

	static int isTrivalent(int[] a) {

		if (a == null || a.length < 3) {
			return 0;
		}

		int[] tempArray = new int[a.length];
		int lengthArray = 0;

		for (int i = 0; i < a.length; i++) {

			if (!(isInArray(a[i], tempArray, lengthArray))) {
				tempArray[lengthArray] = a[i];
				lengthArray++;
			}

		}

		return lengthArray == 3 ? 1 : 0;

	}

	// static int isTrivalent(int[] a) {

	// // -1, 0, 1, 0, 0, 0

	// if (a == null || a.length < 3) {
	// return 0;
	// }
	// int[] tempArray = new int[a.length];;
	// int lengthArray = 0;
	// for (int i = 0; i < a.length; i++) {

	// if(!isInArray(a[i], tempArray, lengthArray)) {
	// tempArray[lengthArray] = a[i];
	// lengthArray++;
	// }
	// }

	// return lengthArray == 3 ? 1 : 0;

	// }

	static boolean isInArray(int n, int a[], int lengthArray) {

		if (lengthArray == 0) {
			return false;
		}

		for (int i = 0; i < lengthArray; i++) {
			if (a[i] == n) {
				return true;
			}
		}

		return false;

	}

}
