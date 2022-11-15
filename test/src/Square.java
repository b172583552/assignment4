/**
 * A class to provide methods for rotating, translating, initialization and
 * getting coordinates of square
 * 
 * @author Wong Man Lok
 */
public class Square extends Shape {
	/**
	 * Set the local vertices by double d
	 * 
	 * @param d distance from origin
	 */
	public void setVertices(double d) {
		this.xLocal = new double[] { d, d, -d, -d }; //set the value according to the formula 
		this.yLocal = new double[] { d, -d, -d, d };

	}
}