package com.ncherry.hw1.one;
/**
 * 
 * 
 * @author Noah Cherry
 * @version hw 1
 * @bugs None
 */
public class Rectangle {
    private double lowerLeftX;
    private double lowerLeftY;
    private double upperRightX;
    private double upperRightY;

    public double getLowerLeftX() {
    	return lowerLeftX;
    }
	
    public double getLowerLeftY() {
    	return lowerLeftY;
    }
    
    public double getUpperRightX() {
    	return upperRightX;
    }
    
    public double getUpperRightY() {
    	return upperRightY;
    }
    
	 /** default constructor
	 * @param None
	 * @return None
	 * Remarks: 
	 **/
	public Rectangle() {
		this.lowerLeftX = 0.0;
		this.lowerLeftY = 0.0;
		this.upperRightX = 1.0;
		this.upperRightY = 1.0;
	}
	
	 /** constructor
	 * @param x coordinate for upper right corner
	 * @param y coordinate for upper right corner
	 * Remarks: 
	 **/
	public Rectangle(double x, double y) {
		this.lowerLeftX = 0.0;
		this.lowerLeftY = 0.0;
		this.upperRightX = x;
		this.upperRightY = y;
	}
	
	 /** constructor
	 * @param x coordinate for lower left corner
	 * @param y coordinate for lower left corner
	 * @param width set the width of the shape
	 * @param height set the height of the shape
	 * @return None
	 * Remarks: 
	 **/
	public Rectangle(double x, double y, double width, double height) {
		if(width < 0) {
			x += width;
			width *= -1;
		}
		if(height < 0) {
			y += height;
			height *= -1;
		}
		
		this.upperRightY = y + height;
		this.upperRightX = x + width;
		this.lowerLeftX = x;
		this.lowerLeftY = y;
	}

	 /** compute the area of the rectangle
	 * @param None
	 * @return result of computation
	 * Remarks: 
	 **/
	public double area() {
		double width = this.upperRightX - this.lowerLeftX;
		double heigth = this.upperRightY - this.lowerLeftY;
		return width * heigth;
	}
	
	 /** compute the perimeter of the rectangle
	 * @param None
	 * @return result of computation
	 * Remarks: 
	 **/
	public double perimeter() {
		double width = this.upperRightX - this.lowerLeftX;
		double heigth = this.upperRightY - this.lowerLeftY;
		return 2 * width + 2 * heigth;
	}
	/** return distance of lower left corner to origin (0, 0)
	 * @param None
	 * @return result of computation
	 */
	public double distanceFromOrigin() {
		double x = this.lowerLeftX;
		double y = this.lowerLeftY;

		return Math.sqrt(x*x + y*y);
	}
	
	/** calculate the length of rectangles diagonal
	 * @param None
	 * @return result of computation
	 */
	public double diagonalLength() {
		double width = Math.abs(this.upperRightX - this.lowerLeftX);
		double height = Math.abs(this.upperRightY - this.lowerLeftY);
		return Math.sqrt(width*width + height*height);
	}
}
