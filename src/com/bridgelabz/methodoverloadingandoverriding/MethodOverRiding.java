package com.bridgelabz.methodoverloadingandoverriding;

public class MethodOverRiding {
	public static void main(String[] args) {
//		Bicycle bicycle = new Bicycle(10, 1);
//		System.out.println("Gear is: " + bicycle.gear);
//		System.out.println("Bike Speed is: " + bicycle.speed);
//		
//		bicycle.applyBreak(1);
//		System.out.println("After applying break, bike Speed is: " + bicycle.speed);
//		
//		bicycle.speedUp(5);
//		System.out.println("After speed up, bike Speed is: " + bicycle.speed);
		
		Bicycle mountainBike = new MountainBike(50, 50, 3);
		System.out.println("Gear is: " + mountainBike.gear);
		System.out.println("Bike Speed is: " + mountainBike.speed);
		
		mountainBike.applyBreak(1);
		System.out.println("After applying break, bike Speed is: " + mountainBike.speed);
		
		mountainBike.speedUp(10);
		System.out.println("After speed up, bike Speed is: " + mountainBike.speed);
	}
}