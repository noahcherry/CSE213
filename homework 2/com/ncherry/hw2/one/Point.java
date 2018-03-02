package com.ncherry.hw2.one;

enum Measurement {CARTESIAN, POLAR}

/**
 * point class
 * 
 * @author Noah Cherry
 * @version hw 2, 1
 * @bugs None
 */
public class Point {
    private double x;    // x-coordinate
    private double y; 
    private double r;
    private double theta;
    private Measurement type;
	
    //getters
    public double getX() {
    	return this.x;
    }
    
    public double getY() {
    	return this.y;
    }
    
    public double getr() {
    	return this.r;
    }
    
    public double getTheta() {
    	return this.theta;
    }
    
    public Measurement getType() {
    	return this.type;
    }
    
    //setters
    public void setX(double x) {
    	this.x = x;
		this.r = Math.sqrt(x * x + y * y);
		this.theta = Math.atan2(y, x);
    }
    
    public void setY(double y) {
    	this.y = y;
		this.r = Math.sqrt(x * x + y * y);
		this.theta = Math.atan2(y, x);
    }
    
    public void setR(double r) {
    	this.r = r;
    	this.x = r * Math.cos(this.theta);
    	this.y = r * Math.sin(this.theta);
    }
    
    public void setTheta(double a) {
    	this.theta = a;
    	this.x = this.r * Math.cos(a);
    	this.y = this.r * Math.sin(a);
    }
    
    public void setType(Measurement type) {
    	this.type = type;
    }
    
    //constructors
	public Point(double x, double y, Measurement type) {
		setType(type);
		if(getType().equals(Measurement.CARTESIAN))
			cartesianInstance(x, y);
		else
			polarInstance(Math.sqrt(x * x + y * y), Math.atan2(y, x));
	}

	private void cartesianInstance(double x, double y) {
		setX(x);
		setY(y);
	}
	
	private void polarInstance(double r, double theta) {
		setR(r);
		setTheta(theta);
	}
	
	//methods
	/**
	 * find distance from "this" to some other known point
	 * @return distance measurement
	 */
	public double euclidianDistance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
	/**
	 * find distance between two points
	 * @return distance measurement
	 */
	public double euclidianDistance(Point p, Point q) {
		return Math.sqrt(Math.pow(p.x - q.x, 2) + Math.pow(p.y - q.y, 2));
	}
	
	/**
	 * find distance from "this" to some other known point, taxi style
	 * @return distance measurement
	 */
	public double manhattanDistance(Point p) {
		return Math.abs(this.getX() - p.getX()) + Math.abs(this.getY() - p.getY());
	}
	
	/**
	 * find distance between two points, taxi style
	 * @return distance measurement
	 */
	public double manhattanDistance(Point p, Point q) {
		return Math.abs(p.getX() - q.getX()) + Math.abs(p.getY() - q.getY());
	}
	
	/**
	 * @return string containgin "[x coordinate], [y coordinate]"
	 */
	public String toString() {
		return String.format("(%d, %d)", this.x, this.y);
	}
}
