public class reverseArr{
	public static void main(String[] Args) {
	int[] arr = {1,2,3,4,5,6};
	int[] revarr = reverse(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(revarr[i]+" ");
	}
	}
	
	public static int[] reverse(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}
}
