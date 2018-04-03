public class SecondLargest {
	public static void main(String[] args) {
		int[] A = { 1, 12, 3, 4, 5, 6, 7, 8};
		System.out.println("The second largest element in the array is " + findSecondLargest(A)+"\n");
		
	}
	
	public static int findSecondLargest(int[] A) {
		int first;
		int second;
		first = second = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > first) {
				second = first;
				first = A[i];
			} else if (A[i] > second && A[i] != first) {
				second = A[i];
			}
		}
		return second;
	}
}