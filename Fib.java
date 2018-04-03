public class Fib {
	public static void main(String[] args) {
		System.out.println("FIB(1)" + fib(1) + "\n");
		System.out.println("FIB(2)" + fib(2) + "\n");
		System.out.println("FIB(3)" + fib(3) + "\n");
		System.out.println("FIB(4)" + fib(4) + "\n");
		System.out.println("FIB(10)" + fib(10) + "\n");
	}
	public static int fib(int i) {
		int size = i;
		if (i==1 || i == 2) {
			return 1;
		} else {
			return fib(i - 1) + fib (i - 2);
		}
	}
}