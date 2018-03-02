package com.ncherry.hw2.one;


public class Rectangle {
    private Point p;
    private double width;
    private double height;

    //getters
    public Point getP() {
    	return this.p;
    }
    
    public double getWidth(){
    	return this.width;
    }
    
    public double getHeight() {
    	return this.height;
    }
    
    //setters
    private void setP(Point p) {
    	this.p = p;
    }
    
    private void setWidth(double w) {
    	this.width = w;
    }
    
    private void setHeight(double h) {
    	this.height = h;
    }
    
    //constructors
	public Rectangle() {
		setP(new Point(0.0, 0.0, Measurement.CARTESIAN));
		setHeight(1);
		setWidth(1);
	}

	public Rectangle(double width, double height) {
		this();
		setHeight(height);
		setWidth(width);
	}

	public Rectangle(Point p, double width, double height) {
		setP(p);
		setHeight(height);
		setWidth(width);
	}
	
	public Rectangle(double x, double y, double width, double height) {
		setP(new Point(x, y, Measurement.CARTESIAN));
		setHeight(height);
		setWidth(width);
	}
	//methods
	
	/**
	 * find area of rectangle
	 * @return area of rectangle
	 */
	public double area() {
		return this.getHeight() * this.getWidth();
	}
	
	/**
	 * find perimeter of rectangle
	 * @return perimeter of rectangle
	 */
	public double perimeter() {
		return 2.0 * (this.getHeight() + this.getWidth());
	}
	
	/**
	 * find distance from bottom left corner to top right corner
	 * @return distance measurement
	 */
	public double diagonalLength() {
		return Math.sqrt(Math.pow(this.getHeight(), 2) + Math.pow(this.getWidth(), 2));
	}
	
	/**
	 * find the distance of bottom left corner to point (0,0)
	 * @return distance measurement
	 */
	public double distanceFromOrigin() {
		return Math.sqrt(Math.pow(this.getP().getX(), 2) + Math.pow(this.getP().getY(), 2));
	}
	
	/**
	 * find "taxi" style distance from (0,0) to lower left corner
	 * @return distance measure
	 */
	public double manhattanDistanceFromOrigin() {
		return this.perimeter() / 2.0;
	}
	
	/**
	 * @return string formatted to containg all rectangle params
	 */
	public String toString() {
		return String.format("(%s, %d, %d,)", this.getP().toString(), this.getHeight(), this.getWidth());
	}

}
