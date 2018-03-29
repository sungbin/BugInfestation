package edu.handong.csee.java.lab06; //the class is in this package

/**
 * @author sungbin
 * this class include many functions like setting, condition check
 * 	set function is initialization function before starting
 * 	IsContinue function is to check condition if it should be stopped
 * 	NewBugs function put the value to newBugs variable after calculation
 * 	NewBugVolume function put the value after calculation to newBugsVolume variable
 * 	Population function put the value to newBugs variable after calculation
 * 	TotalBugVolume function put the value to newBugs variable after calculation
 * 	CountWeeks function increase 1 countWeeks
 * all functions are declared of public type
 */
public class BugInfestation { // declare BugInfestation public type

	static final double GROWTH_RATE = 0.95; //—weekly growth rate of the roach population
	static final double ONE_BUG_VOLUME = 0.002; //—volume of an average roach (a constant 0.002)
	double houseVolume; //— volume of the house
	int startPopulation; //—initial number of roaches
	int countWeeks; //—week counter
	int population; //—current number of roaches
	int totalBugVolume; //—total volume of all the roaches
	int newBugs; //—number of roaches hatched this week
	double newBugVolume; //—volume of new roaches
	
	public void set(double h, int sP) //declare set function public type, declare parameter variable
	{
		houseVolume = h; //push h to houseVolume
		startPopulation = sP; //push sP to startPopulation
		population = startPopulation; //push startPopulation to population
		totalBugVolume = (int) (population * ONE_BUG_VOLUME); //push value (population * constant) to total BugVolume through int type
		countWeeks = 0; // initialize countWeeks
	}
	
	public boolean isContinue() //declare IsContinue function type public, return type is boolean
	{
		if(totalBugVolume < houseVolume) // Is totalBugVolume smaller than houseVolume??
			return true; // if correct, return true
		return false; // or return false
	}
	
	public void newBugs() //declare NewBugs function public type
	{
		newBugs = (int) (population * GROWTH_RATE); // push value(population * GROWTH_RATE) to newBugs
	}
	public void newBugVolume() //declare NewBugVolume function public type
	{
		newBugVolume = newBugs * ONE_BUG_VOLUME; // push value(newBugs * ONE_BUG_VOLUME) to newBugVolume
	}
	public void computePopulation() //declare Population function public type
	{
		population = population + newBugs; // push value(population + newBugs) to population
	}
	public void totalBugVolume() //declare TotalBugVolume function public type
	{
		totalBugVolume = (int) (totalBugVolume + newBugVolume); //push value (totalBugVolume + newBugVolume) to totalBugVolume through int type
	}
	public void countWeeks() //declare ConutWeeks function public type
	{
		countWeeks = countWeeks +1; // Increase 1 countWeeks ;
	}
}