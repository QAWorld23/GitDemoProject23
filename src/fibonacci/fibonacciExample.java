package fibonacci;

public class fibonacciExample {

	class Main {
		public static void main(String[] args) {
//new one
			int n = 12, firstTerm = 0, secondTerm = 1;
			System.out.println("Fibonacci Series till " + n + " terms:");

			for (int i = 1; i <= n; ++i) {
				System.out.print(firstTerm + ", ");

				// compute the next term
				int nextTerm = firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			}
		}
	}
}