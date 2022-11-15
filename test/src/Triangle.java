
/**
 * A class to provide methods for rotating, translating, initialization and
 * getting coordinates of triangle
 * 
 * @author Wong Man Lok
 */
public class Triangle extends Shape {
	/**
	 * Set the local vertices by double d
	 * 
	 * @param d distance from origin
	 */
	public void setVertices(double d) {
		// set the value according to the formula
		this.xLocal = new double[] { d, -d * Math.cos(Math.PI / 3), -d * Math.cos(Math.PI / 3) };
		this.yLocal = new double[] { 0, -d * Math.sin(Math.PI / 3), d * Math.sin(Math.PI / 3) };
	}

}
