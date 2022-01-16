package com.bridgelabz.multipleinheritance;

import com.bridgelabz.interfaces.Bicycle;

public class MountainBike extends TwoWheeler implements Bicycle, Vehicle {
	
	private int gear;
	private int speed;
	private int seatHeight;
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		seatHeight =startHeight;
		speed = startSpeed;
		gear = startGear;
	}

	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSeatHeight() {
		return seatHeight;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public void applyBreak(int decrement) {
		speed = speed-decrement;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed+increment;
	}

	@Override
	public void canDrive() {
		System.out.println("MountainBike can be driven");
	}
}