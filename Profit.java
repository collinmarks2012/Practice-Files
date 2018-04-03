public class Profit{
	public static void main(String[] args) {
		int[] stockPricesYesterday = new int[] {10, 7, 5, 8, 11, 9};
		System.out.println(getMaxProfit(stockPricesYesterday));
	}
	public static int getMaxProfit(int[] A) {
		// We must find min & max of array
		int MAX = Integer.MIN_VALUE;
		int[][] P = new int[A.length][A.length];
		// i represents buy time
		// j represents sell time
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (j >= i) {
					P[i][j] = Integer.MIN_VALUE;
				} else {
					P[i][j] = A[i] - A[j];
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (P[i][j] > MAX) {
					MAX = P[i][j];
				}
			}
		}
		// Now need to find max value...
		for (int k = 0; k < A.length; k++) {
			for (int l = 0; l < A.length; l++) {
				System.out.print(" " + P[l][k] + " ");
			}
			System.out.println("\n");
		}
		return MAX;
	}
}