import java.awt.Color;

/**
 * A class to test the function of Circle class
 * 
 * @author Wong Man Lok
 */
public class CirlceTester {
	/**
	 * main to drive the test
	 * 
	 * @param args not used 
	 */
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.xc = 0;
		circle.yc = 0;
		circle.theta = Math.PI / 3;
		circle.color = new Color(250, 0, 0);
		circle.filled = true;
		circle.setVertices(2);

		System.out.print("local x coordinates: ");
		for (double x : circle.xLocal) {
			System.out.printf("%f ", x);
		}
		System.out.println("\nexpected result: -2.000000 2.000000");

		System.out.print("local y coordinates: ");
		for (double y : circle.yLocal) {
			System.out.printf("%f ", y);
		}
		System.out.println("\nexpected result: -2.000000 2.000000");

		circle.translate(4, 3);
		circle.rotate(Math.PI / 8);

		int[] xScreen = circle.getX();
		int[] yScreen = circle.getY();

		System.out.print("xscreen outputs: ");
		for (int x : xScreen) {
			System.out.format("%d ", x);
		}
		System.out.println();
		System.out.println("expected output: 2 6");

		System.out.print("yscreen outputs: ");
		for (int y : yScreen) {
			System.out.format("%d ", y);
		}
		System.out.println();
		System.out.println("expected output: 1 5");

	}
}
