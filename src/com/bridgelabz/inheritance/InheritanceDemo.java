package com.bridgelabz.inheritance;

class InheritanceDemo {
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		System.out.println("Gear is: " + mountainBike.gear);
		System.out.println("Bike Speed is: " + mountainBike.speed);
		System.out.println("Seat height is: " + mountainBike.seatHeight);
		
		mountainBike.applyBreak(1);
		System.out.println("After applying break, bike Speed is: " + mountainBike.speed);
		
		mountainBike.speedUp(5);
		System.out.println("After speed up, bike Speed is: " + mountainBike.speed);
	}
}