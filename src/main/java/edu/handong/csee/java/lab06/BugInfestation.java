package edu.handong.csee.java.lab06; //the class is in this package

/**
 * @author sungbin
 * this class include many functions like setting, condition check
 * set function is initialization function before starting
 * IsContinue function is to check condition if it should be stopped
 * NewBugs function put the value to newBugs variable after calculation
 * NewBugVolume function put the value after calculation to newBugsVolume variable
 * Population function put the value to newBugs variable after calculation
 * TotalBugVolume function put the value to newBugs variable after calculation
 * CountWeeks function increase 1 countWeeks
 */
public class BugInfestation { // declare BugInfestation type public

	static final double GROWTH_RATE = 0.95; //—weekly growth rate of the roach population
	static final double ONE_BUG_VOLUME = 0.002; //—volume of an average roach (a constant 0.002)
	double houseVolume; //— volume of the house
	int startPopulation; //—initial number of roaches
	int countWeeks; //—week counter
	int population; //—current number of roaches
	int totalBugVolume; //—total volume of all the roaches
	int newBugs; //—number of roaches hatched this week
	double newBugVolume; //—volume of new roaches
	
	void set(double h, int sP) //declare set function, declare parameter variable
	{
		houseVolume = h; //push h to houseVolume
		startPopulation = sP; //push sP to startPopulation
		population = startPopulation; //push startPopulation to population
		totalBugVolume = (int) (population * ONE_BUG_VOLUME); //push value (population * constant) to total BugVolume through int type
		countWeeks = 0; // initialize countWeeks
	}
	
	public boolean IsContinue() //declare IsContinue function type public, return type is boolean
	{
		if(totalBugVolume < houseVolume) // Is totalBugVolume smaller than houseVolume??
			return true; // if correct, return true
		return false; // or return false
	}
	
	void NewBugs() //declare NewBugs function
	{
		newBugs = (int) (population * GROWTH_RATE); // push value(population * GROWTH_RATE) to newBugs
	}
	void NewBugVolume() //declare NewBugVolume function
	{
		newBugVolume = newBugs * ONE_BUG_VOLUME; // push value(newBugs * ONE_BUG_VOLUME) to newBugVolume
	}
	void Population() //declare Population function
	{
		population = population + newBugs; // push value(population + newBugs) to population
	}
	void TotalBugVolume() //declare TotalBugVolume function
	{
		totalBugVolume = (int) (totalBugVolume + newBugVolume); //push value (totalBugVolume + newBugVolume) to totalBugVolume through int type
	}
	void CountWeeks() //declare ConutWeeks function
	{
		countWeeks = countWeeks +1; // Increase 1 countWeeks ;
	}
}