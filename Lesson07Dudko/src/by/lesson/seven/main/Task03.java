package by.lesson.seven.main;

public class Task03 {

	public static void main(String[] args) {
		double x;
		double fx;
		int n;
		double sum;

		x = 0.5;
		n = 20;
		sum=0;

		for (double k = 1; k <= n; k++) {
			sum = sum + (Math.sin((k * x) / 2.0) + Math.sin((k * x - 1) / 2.0)) / Math.pow(Math.E, (x - 1 / k));
		}
		
		fx = Math.sqrt(n * Math.PI)*sum;
		System.out.print("fx = "+fx);
	}
	


}
