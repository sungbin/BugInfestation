package edu.handong.csee.java.lab06;

import java.util.Scanner; // including Scanner functions
public class main {

	public static void main(String[] args) {
		
		double houseVolume; //— volume of the house
		int startPopulation; //—initial number of roaches
		
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		BugInfestation bug = new BugInfestation();

		System.out.print("Enter the total volume of your house in cubic feet: "); //print sentence
		houseVolume = keyboard.nextDouble(); //input one spelling to variable1
		System.out.print("Enter the estimated number of roaches in your house: "); //print sentence
		startPopulation = keyboard.nextInt(); //input one spelling to variable1
		
		bug.set(houseVolume,startPopulation);
		
		while(bug.IsContinue())
		{
			bug.NewBugs();
			bug.NewBugVolume();
			bug.Population();
			bug.TotalBugVolume();
			bug.CountWeeks();
		}
		
		System.out.println("Starting with a roach population of "+ bug.startPopulation);
		System.out.println("and a house with a volume of " + bug.houseVolume + " cubic feet, after " 
				+bug.countWeeks + " weeks,");
		System.out.println("the house will be filled with " + bug.population + " roaches.");
		System.out.println("They will fill a volume of " + bug.totalBugVolume + " cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");

	}
}