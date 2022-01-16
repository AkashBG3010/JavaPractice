package com.bridgelabz.classesandobjects;

public class Cuboid {
	int width;
	int height;
	int depth;
	
	Cuboid(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	Cuboid(int width, int height) {
		this.width = width;
		this.height = height;
		this.depth = 10;
	}
	Cuboid(int dimention) {
		this.width = dimention;
		this.height = dimention;
		this.depth = dimention;
	}
	Cuboid() {
		this.width = 10;
		this.height = 10;
		this.depth = 10;
	}
	
	int volume() {
		return width*height*depth;
	}
	
	public static void main(String[] args) {
		int volume;
		
		Cuboid stdCuboid = new Cuboid(10, 20, 30);
		volume = stdCuboid.volume();
		System.out.println("Volume of simple cuboid is: " +volume);
		
		Cuboid cuboidWithDefaults = new Cuboid(10, 20);
		volume = cuboidWithDefaults.volume();
		System.out.println("Volume of cuboid with default value is: " +volume);
		
		Cuboid cube = new Cuboid(10);
		volume = cube.volume();
		System.out.println("Volume of cube is: " +volume);
		
		Cuboid defaultCuboid = new Cuboid(10, 20, 30);
		volume = defaultCuboid.volume();
		System.out.println("Volume of default cuboid is: " +volume);
	}
}