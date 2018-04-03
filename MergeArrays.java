public class MergeArrays{
	public static void main(String[] args) {
		int[] A = {1, 3, 5, 7, 0, 0, 0};
		int[] B = {2, 4, 6};
		int[] C = new int[A.length];
		int j = 0, k = 0;
		for (int i = 0; i < C.length; i++) {
		if (A[i] < B[j] || A[i] == 0) {
				C[i] = A[i];
			} else {
				C[i] = B[j++];
			}
		}
/* 	while (k < C.length) {
			if (A[i] < B[j]) {
				C[k++] = A[i++];
			} else {
				C[k++] = B[j++];
			}
		}
		while (j < B.length) {
		C[k++] = B[j++];
		} */
		for (int l = 0; l < C.length;l++) {
		System.out.print(C[l]+ " ");
	}
	}
}