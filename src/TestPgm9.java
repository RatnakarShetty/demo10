
public class TestPgm9 {

	public static void main(String[] args) {

		int r, c, m = 5, n = 5;

		for (r = 1; r <= m; r++) {

			for (c = 1; c <= n; c++) {
				if (r == c || r + c == n + 1 || c == 1 || c == n)

					System.out.print("*");
				else
					System.out.print(" ");

			}

			System.out.println();
		}

	}

}
