package edu.handong.csee.java.lab06; //the class is in this package

import java.util.Scanner; // including Scanner functions
/**
 * @author sungbin
 * this function scan two number (one means cubic feet of house, another means number of roaches) from user
 * call BugInfestation function to calculate minimum weeks when roaches increase and house is full of roaches 
 * so need BugInfestation function
 * after calculation, print result minimum weeks, final Bugs population, final Bugs volume.
 */
public class main { //declare main class public type

	public static void main(String[] args) { //declare main method public type
		
		double houseVolume; //— declare variable, volume of the house double type
		int startPopulation; //—declare variable, initial number of roaches int type
		
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); //make instance of Scanner class
		BugInfestation bug = new BugInfestation(); //make instance of BugInfestation class

		System.out.print("Enter the total volume of your house in cubic feet: "); //print sentence
		houseVolume = keyboard.nextDouble(); //input one spelling to variable1
		System.out.print("Enter the estimated number of roaches in your house: "); //print sentence
		startPopulation = keyboard.nextInt(); //input one spelling to variable1
		
		bug.set(houseVolume,startPopulation); //call set function
		
		while(bug.isContinue()) // if IsContinue function is TRUE, repeat!
		{
			bug.newBugs(); //call NewBugs function
			bug.newBugVolume(); //call NewBugVolume function
			bug.computePopulation(); //call Population function
			bug.totalBugVolume(); //call TotalBugVolume function
			bug.countWeeks(); //call CountWekks function
		}
		
		System.out.println("Starting with a roach population of "+ bug.startPopulation); //print sentence and variable
		System.out.println("and a house with a volume of " + bug.houseVolume + " cubic feet, after " 
							+bug.countWeeks + " weeks,"); //print sentence and variable
		System.out.println("the house will be filled with " + bug.population + " roaches."); //print sentence and variable
		System.out.println("They will fill a volume of " + bug.totalBugVolume + " cubic feet."); //print sentence and variable
		System.out.println("Better call Debugging Experts Inc."); //print sentence and
	}
}