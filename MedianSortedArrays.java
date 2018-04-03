public class MedianSortedArrays {
	public static void main(String[] args) {
	int[] arr1 = {1, 3, 5};
	int[] arr2 = {2, 4, 6};
	int[] arr = new int[arr1.length+arr2.length];
	int i = 0, j = 0, k = 0;
	while (i < arr1.length && j < arr2.length) {
		if (arr1[i] < arr2[j]) {
			arr[k++] = arr1[i++];
		} else {
			arr[k++] = arr2[j++];
		}
	}
	while (i < arr1.length) {
		arr[k++] = arr1[i++];
	}
	while (j < arr2.length) {
		arr[k++] = arr2[j++];
	}
	for (int l = 0; l < arr.length;l++) {
		System.out.print(arr[l]+ " ");
	}
	if (arr.length % 2 != 0) {
		System.out.println("Median is "+ arr[(arr.length-1)/2]);
	}else{
		double avg = (arr[arr.length/2]+arr[(arr.length/2) - 1]);
		avg = avg/2;
		System.out.println("\nMedian is "+ avg);
	}
}
}
