public class Intersect{
	public static void main(String[] args) {
		System.out.print(intersect(2,5,3,10));
	}
	public static String intersect(int a1, int b1, int a2, int b2) {
		int det = a1*b2 - a2*b1;
		if (det == 0) {
			return "FALSE";
		} else {
			return "TRUE";
		}
	}
}