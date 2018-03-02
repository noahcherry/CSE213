package com.ncherry.hw1.one;
/**
 * 
 * 
 * @author Noah Cherry
 * @version hw 1
 * @bugs None
 */
public class Sphere {
	private double centerX;
	private double centerY;
	private double centerZ;
	private double radius;
	
	 /** getter for variable centerX
	 * @param None
	 * @return value of centerX
	 * Remarks: 
	 **/
	public double getCenterX() {
		return this.centerX;
	}
	
	 /** getter for centerY
	 * @param None
	 * @return value of centerY
	 * Remarks: 
	 **/
	public double getCenterY() {
		return this.centerY;
	}
	
	 /** getter for centerZ
	 * @param None
	 * @return value of centerY
	 * Remarks: 
	 **/
	public double getCenterZ() {
		return this.centerZ;
	}
	
	 /** getter for radius
	 * @param None
	 * @return value of radius
	 * Remarks: 
	 **/
	public double getRadius() {
		return this.radius;
	}
	
	 /** constructor
	 * @param None
	 * @return None
	 * Remarks: 
	 **/
	public Sphere() {
		this.centerX = 0.0;
		this.centerY = 0.0;
		this.centerZ = 0.0;
		this.radius = 1.0;
	}
	
	 /** constructor
	 * @param x double for center x coordinate
	 * @param y double for center y coordinate
	 * @param z double for center z coordinate
	 * @param radius double for value of Sphere radius
	 * @return None
	 * Remarks: 
	 **/
	public Sphere(double x, double y, double z, double radius) {
		this.centerX = x;
		this.centerY = y;
		this.centerZ= z;
		this.radius = radius;
	}
	
	 /** compute the volume of an object of Sphere
	 * @param None
	 * @return value of the area computation (4 / 3) * (radius ^ 3) * PI
	 * Remarks: 
	 **/
	public double volume() {
		return (4.0 / 3.0) * this.radius * this.radius* this.radius * Math.PI;
	}
	
	 /** compute the surface area of an object of type Sphere
	 * @param None
	 * @return value of perimeter computation (4 * radius^2 * PI)
	 * Remarks: 
	 **/
	public double surfaceArea() {
		return 4 * this.radius * this.radius * Math.PI;

	}
	
	 /** Compute the distance of the Spheres center from the origin (0, 0, 0)
	 * @param None.
	 * @return computation of distance
	 * Remarks: 
	 **/
	public double distanceFromOrigin() {
		double x = this.centerX;
		double y = this.centerY;
		double z = this.centerZ;
		return Math.sqrt(x * x + y * y + z * z);
	}
}
