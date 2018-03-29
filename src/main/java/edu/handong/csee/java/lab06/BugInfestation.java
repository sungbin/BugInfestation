package edu.handong.csee.java.lab06;

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