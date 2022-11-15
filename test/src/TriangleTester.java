import java.awt.Color;

/**
 * A class to test the function of Triangle class
 * 
 * @author Wong Man Lok
 */
public class TriangleTester {
	/**
	 * main to drive the test
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.xc = 1.0;
		triangle.yc = 1.0;
		triangle.theta = Math.PI / 12;
		triangle.color = new Color(250, 0, 0);
		triangle.filled = true;
		triangle.setVertices(6.0);

		System.out.print("x coordinates: ");
		for (double x : triangle.xLocal) {
			System.out.printf("%f ", x);
		}
		System.out.println("\nexpected result: 6.000000 -3.000000 -3.000000 ");

		System.out.print("y coordinates: ");
		for (double y : triangle.yLocal) {
			System.out.printf("%f ", y);
		}
		System.out.println("\nexpected result: 0.000000 -5.196152 5.196152");

		triangle.translate(3, 4);
		triangle.rotate(Math.PI / 8);

		int[] xScreen = triangle.getX();
		int[] yScreen = triangle.getY();
		System.out.print("xscreen outputs: ");
		for (int x : xScreen) {
			System.out.format("%d ", x);

		}
		System.out.println();
		System.out.println("expected output: 9 5 -2");

		System.out.print("yscreen outputs: ");
		for (int y : yScreen) {
			System.out.format("%d ", y);

		}
		System.out.println();
		System.out.println("expected output: 9 -1 7");

	}

}
