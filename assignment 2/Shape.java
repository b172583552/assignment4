import java.awt.Color;

/**
 * A class has private instance variables for storing
 * color, fill-type, orientation, canvas coordinates of the center, and the
 * local coordinates of the
 * vertices of a shape. It has public getters and setters for accessing its
 * private instance variables.
 * It also has public methods for translating and rotating a shape, and for
 * getting the canvas
 * coordinates of the vertices of a shape
 * 
 * @author Wong Man Lok
 */
public class Shape {
    private Color color; // color of the shape
    private boolean filled; // whether the shape is filled or not filled
    private double theta; // orientation (in radians) of the shape in the canvas coordinate system
    private double xc; // the x-coordinate of the center of the shape in the canvas coordinate system
    private double yc; // the y-coordinate of the center of the shape in the canvas coordinate system
    private double[] xLocal; // the x-coordinates of the vertices (in counter-clockwise order) of the shape in its local coordinate system
    private double[] yLocal; // the y-coordinates of the vertices (in counter-clockwise order) of the shape in its local coordinate system

    /**
     * get the color of shape
     * 
     * @return a Color object specifying the color code
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * get whether the shape is filled
     * 
     * @return a boolean value specifying if the shape is filled
     */
    public boolean getFilled() {
        return this.filled;
    }

    /**
     * get the orientation of the shape (in radians) in canvas coordiante system
     * 
     * @return a double value of the orientation
     */
    public double getTheta() {
        return this.theta;
    }

    /**
     * get the x-coordinate of the center of the shape in the canvas coordinate
     * system.
     * 
     * @return a double value specifying x-coordinate of the center of the shape in
     *         the canvas coordinate system.
     */
    public double getXc() {
        return this.xc;
    }

    /**
     * retrieving the y-coordinate of the center of the shape in the canvas
     * coordinate system
     * 
     * @return a double value specifying the y-coordinate of the center of the shape
     *         in the canvas coordinate system
     */
    public double getYc() {
        return this.yc;
    }

    /**
     * retrieving the x-coordinates of the vertices (in counter-clockwise order) of
     * the shape in its local coordinate system
     * 
     * @return double array for the x-coordinates of the vertices (in
     *         counter-clockwise order) of the shape in its local coordinate system
     */
    public double[] getXLocal() {
        return this.xLocal;
    }

    /**
     * retrieving the y-coordinates of the vertices (in counter-clockwise order) of
     * the shape in its local coordinate system.
     * 
     * @return double array for the y-coordinates of the vertices (in
     *         counter-clockwise order) of the shape in its local coordinate system
     */
    public double[] getYLocal() {
        return this.yLocal;
    }

    /**
     * setting the color of the shape
     * 
     * @param color Color type for color code
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * setting the fill-type of the shape
     * 
     * @param filled boolean for the filled status
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * setting the orientation of the shape
     * 
     * @param theta double value for orientation in radian
     */
    public void setTheta(double theta) {
        this.theta = theta;
    }

    /**
     * setting the x-coordinate of the center of the shape in the canvas coordinate
     * system.
     * 
     * @param xc double value for x-coordinate of the center of the shape in the
     *           canvas coordinate system.
     */
    public void setXc(double xc) {
        this.xc = xc;
    }

    /**
     * setting the y-coordinate of the center of the shape in the canvas coordinate
     * system.
     * 
     * @param yc double value for y-coordinate of the center of the shape in the
     *           canvas coordinate system.
     */
    public void setYc(double yc) {
        this.yc = yc;
    }

    /**
     * setting the x-coordinates of the vertices (in counter-clockwise order) of the
     * shape in its local coordinate system
     * 
     * @param xLocal double array for x-coordinates of the vertices (in
     *               counter-clockwise order) of the shape in its local coordinate
     *               system
     */
    public void setXLocal(double[] xLocal) {
        this.xLocal = xLocal;
    }

    /**
     * setting the y-coordinates of the vertices (in counter-clockwise order) of the
     * shape in its local coordinate system
     * 
     * @param yLocal double array for y-coordinates of the vertices (in
     *               counter-clockwise order) of the shape in its local coordinate
     *               system
     */
    public void setYLocal(double[] yLocal) {
        this.yLocal = yLocal;
    }

    /**
     * translating the center of the shape by dx and dy, respectively, along the x
     * and y directions of the canvas coordinate system
     * 
     * @param dx unit of x coordinate translated
     * @param dy unit of y coordinate translated
     */
    public void translate(double dx, double dy) {
        this.xc += dx;
        this.yc += dy;
    }

    /**
     * rotating the shape about its center by an angle of dt (in radians)
     * 
     * @param dt double for degrees in radian
     */
    public void rotate(double dt) {
        this.theta += dt;
    }

    /**
     * retrieving the x-coordinates of the vertices (in counterclockwise order) of
     * the shape in the canvas coordinate system
     * 
     * @return integer array for x-coordinates of the vertices (in counterclockwise
     *         order) of the shape in the canvas coordinate system
     */
    public int[] getX() {
        int[] xCanvas = new int[this.xLocal.length];
        for (int i = 0; i < this.xLocal.length; i++) {
            xCanvas[i] = (int) Math
                    .round(this.xLocal[i] * Math.cos(this.theta) - this.yLocal[i] * Math.sin(this.theta) + xc);
        }
        return xCanvas;
    }

    /**
     * retrieving the y-coordinates of the vertices (in counterclockwise order) of
     * the shape in the canvas coordinate system
     * 
     * @return integer array for y-coordinates of the vertices (in counterclockwise
     *         order) of the shape in the canvas coordinate system
     */
    public int[] getY() {
        int[] yCanvas = new int[this.yLocal.length];
        for (int i = 0; i < this.yLocal.length; i++) {
            yCanvas[i] = (int) Math
                    .round(this.xLocal[i] * Math.sin(this.theta) + this.yLocal[i] * Math.cos(this.theta) + yc);
        }
        return yCanvas;
    }

}