package com.bridgelabz.examples;

public class EmpWageBuilder {

	public static void main(String[] args) {
			int WAGE_PER_HOUR = 20;
			int empHrs = 0;
			int empWage = 0;
			int totalEmpWage = 0;
			int IS_FULL_TIME = 1;
			int TOTAL_HOURS = 100;
			int TOTAL_DAYS = 20;
			
			System.out.println("Welcome to Employe Wage Computation!");
			
			switch (getRandomNumber()) {
			
			case 1: int work =getRandomWork();
					if (work == IS_FULL_TIME) {
						System.out.println("Employee is Present for full time");
						empHrs = 8;
						empWage = empHrs * WAGE_PER_HOUR;
						System.out.println("The total Wage is: "+empWage);
					}
			
					else {
						System.out.println("Employee is Present for part time");
						empHrs = 4;
						empWage = empHrs * WAGE_PER_HOUR;
						System.out.println("The total Wage is: "+empWage);
					}
			break;
				
			case 0: System.out.println("Employee is Absent");
				empHrs = 0;
				empWage = empHrs * WAGE_PER_HOUR;
				System.out.println("The total Wage is: "+empWage);
			break;
			}
		}
		public static int getRandomNumber() {
			int getRandomNumber = (Math.random() <= 0.5) ? 0 : 1;
			return getRandomNumber;
		}

		public static int getRandomWork() {
			int getRandomWork = (Math.random() <= 0.5) ? 0 : 1;
			return getRandomWork;
		}

}