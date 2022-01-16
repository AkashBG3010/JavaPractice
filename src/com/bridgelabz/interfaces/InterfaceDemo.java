package com.bridgelabz.interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		
		System.out.println("Gear is: " + mountainBike.getGear());
		System.out.println("Bike Speed is: " + mountainBike.getSpeed());
		System.out.println("Seat height is: " + mountainBike.getSeatHeight());
		
		mountainBike.applyBreak(1);
		System.out.println("After applying break, bike Speed is: " + mountainBike.getSpeed());
		
		mountainBike.speedUp(5);
		System.out.println("After speed up, bike Speed is: " + mountainBike.getSpeed());
	}
}