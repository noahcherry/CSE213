package com.ncherry.hw1.one;

public class Test {

	public static void main(String[] args) {
		//rectangle tests
		testRectangleNoPoints();
		testRectangleFourPoints();
		testRectangleTwoPoints();
		testRectangleArea();
		testRectanglePerimeter();
		testRectangleDistanceFromOrigin();
		testRectangleDiagonalLength();
		//end rectangle tests
		//sphere tests
		testSphereNoValues();
		testSphereWithValues();
		testSphereSurfaceArea();
		testSphereDistanceFromOrigin();
		//end sphere tests
		
	}
	
	public static void testSphereDistanceFromOrigin() {
		Sphere Sphere = new Sphere(1, 2, 3, 3);
		if(Sphere.distanceFromOrigin() != Math.sqrt(1 * 1 + 2 * 2 + 3 * 3))
			System.out.println("testSphereDistanceFromOrigin: Wrong!");
	}
	
	public static void testSphereSurfaceArea() {
		Sphere Sphere = new Sphere(1, 2, 3, 3);
		double r = Sphere.getRadius();
		if(Sphere.surfaceArea() != Math.PI * r * r * 4)
			System.out.println("testSphereSurfaceArea: Wrong!");
	}
	
	public static void testSphereVolume() {
		Sphere Sphere = new Sphere(1, 2, 3, 3);
		double r = Sphere.getRadius();
		if(Sphere.volume() != Math.PI * r * r * r * 4.0 / 3.0)
			System.out.println("testSphereVolume: Wrong!");
	}
	
	public static void testSphereWithValues() {
		Sphere Sphere = new Sphere(1, 2, 3, 3);
		double x = Sphere.getCenterX();
		double y = Sphere.getCenterY();
		double r = Sphere.getRadius();
		if(x != 1 || y != 2 || r != 3)
			System.out.println("testSphereWithValues: Wrong!");

	}
	
	public static void testSphereNoValues() {
		Sphere Sphere = new Sphere();
		double x = Sphere.getCenterX();
		double y = Sphere.getCenterY();
		double r = Sphere.getRadius();
		if(x != 0 || y != 0 || r != 1)
			System.out.println("testSphereNoValues: Wrong!");
	}
	
	public static void testRectangleDiagonalLength() {
		Rectangle rect = new Rectangle(3, 4, -2, -2);
		if (rect.diagonalLength() != Math.sqrt(8))
			System.out.println("testRectangleDiagonalLength: Wrong!");
	}
	
	public static void testRectangleDistanceFromOrigin() {
		Rectangle rect = new Rectangle(3, 4, -2, -2);
		if (rect.distanceFromOrigin() != Math.sqrt(1*1 + 2*2))
			System.out.println("testRectangleDistanceFromOrigin: Wrong!");
	}
	
	public static void testRectanglePerimeter() {
		Rectangle rect = new Rectangle(3, 4, -2, -2);
		if (rect.perimeter() != 8)
			System.out.println("testRectanglePerimeter: Wrong!");
	}
	
	public static void testRectangleArea() {
		Rectangle rect = new Rectangle(3, 4, -2, -2);
		if (rect.area() != 4)
			System.out.println("testRectangleArea: Wrong!");
	}
	
	public static void testRectangleNoPoints() {
		Rectangle rect = new Rectangle();
		double x1 = rect.getLowerLeftX();
		double y1 = rect.getLowerLeftY();
		double x2 = rect.getUpperRightX();
		double y2 = rect.getUpperRightY();
		if (x1 != 0 || y1 != 0) 
			System.out.println("testRectangleNoPoints: Wrong lower left point!");
		if (x2 != 1 || y2 != 1) 
			System.out.println("testRectangleNoPoints: Wrong upper right point!");
	}
	
	public static void testRectangleTwoPoints() {
		Rectangle rect = new Rectangle(1, 2);
		double x1 = rect.getLowerLeftX();
		double y1 = rect.getLowerLeftY();
		double x2 = rect.getUpperRightX();
		double y2 = rect.getUpperRightY();
		if (x1 != 0 || y1 != 0) 
			System.out.println("testRectangleTwoPoints: Wrong lower left point!");
		if (x2 != 1 || y2 != 2) 
			System.out.println("testRectangleTwoPoints: Wrong upper right point!");
		
	}
	
	public static void testRectangleFourPoints() {
		Rectangle rect = new Rectangle(3, 4, -2, -2);
		double x1 = rect.getLowerLeftX();
		double y1 = rect.getLowerLeftY();
		double x2 = rect.getUpperRightX();
		double y2 = rect.getUpperRightY();
		if (x1 != 1 || y1 != 2) 
			System.out.println("testRectangleFourPoints: Wrong lower left point!");
		if (x2 != 3 || y2 != 4) 
			System.out.println("testRectangleFourPoints: Wrong upper right point!");
	}
}