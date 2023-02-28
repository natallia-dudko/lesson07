package by.lesson.seven.main;

public class Task07 {

	public static void main(String[] args) {
		double x;
		double z;
		double y;

		double xStart;
		double zStart;

		double hX;
		double zX;

		int n;
		int m;

		xStart = 0.5;
		zStart = 0.6;

		hX = 0.50;
		zX = 0.60;

		n = 5;
		m = 3;

		x = xStart;
		for (int i = 0; i < n; i++) {
			System.out.println("x = " + x);
			z = zStart;
			for (int j = 0; j < m; j++) {
				y = Math.sqrt(z * z + x * x) * Math.log(z) + Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);
				System.out.println("     z = " + z + ", y = " + y);
				z = z + zX;
			}
			x = x + hX;
		}

	}

}
