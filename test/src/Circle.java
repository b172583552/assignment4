/**
 * A class to provide methods for rotating, translating ,initialization and
 * getting coordinates of circle
 * 
 * @author Wong Man Lok
 */
public class Circle extends Shape {
	/**
	 * Set the local vertices by double d
	 * 
	 * @param d distance from origin
	 */
	public void setVertices(double d) {
		this.xLocal = new double[] { -d, d }; //set the value according to the formula 
		this.yLocal = new double[] { -d, d };
	}

	/**
	 * Get the canvas x coordinates for all vertices
	 * 
	 * @return an integer array containing the x-coordinates vertices
	 */
	public int[] getX() {
		int[] xCanvas = new int[this.xLocal.length];
		for (int i = 0; i < this.xLocal.length; i++) {
			xCanvas[i] = (int) Math.round(this.xLocal[i] + this.xc); //set the value according to the formula 
		}
		return xCanvas;

	}

	/**
	 * Get the canvas y coordinates for all vertices
	 * 
	 * @return an integer array containing the y-coordinates vertices
	 */
	public int[] getY() {
		int[] yCanvas = new int[this.yLocal.length];
		for (int i = 0; i < this.yLocal.length; i++) {
			yCanvas[i] = (int) Math.round(this.yLocal[i] + this.yc); //set the value according to the formula 
		}
		return yCanvas;
	}
}
