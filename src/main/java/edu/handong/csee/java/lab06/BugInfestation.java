package edu.handong.csee.java.lab06;

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
public class BugInfestation {

	static final double GROWTH_RATE = 0.95; //—weekly growth rate of the roach population
	static final double ONE_BUG_VOLUME = 0.002; //—volume of an average roach (a constant 0.002)
	double houseVolume; //— volume of the house
	int startPopulation; //—initial number of roaches
	int countWeeks; //—week counter
	int population; //—current number of roaches
	int totalBugVolume; //—total volume of all the roaches
	int newBugs; //—number of roaches hatched this week
	double newBugVolume; //—volume of new roaches
	
	void set(double h, int sP)
	{
		houseVolume = h;
		startPopulation = sP;
		population = startPopulation;
		totalBugVolume = (int) (population * ONE_BUG_VOLUME);
		countWeeks = 0;
	}
	
	public boolean IsContinue()
	{
		if(totalBugVolume < houseVolume)
			return true;
		return false;
	}
	
	void NewBugs()
	{
		newBugs = (int) (population * GROWTH_RATE);
	}
	void NewBugVolume()
	{
		newBugVolume = newBugs * ONE_BUG_VOLUME;
	}
	void Population()
	{
		population = population + newBugs;
	}
	void TotalBugVolume()
	{
		totalBugVolume = (int) (totalBugVolume + newBugVolume);
	}
	void CountWeeks()
	{
		countWeeks = countWeeks +1;
	}
}