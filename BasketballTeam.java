
public class BasketballTeam extends SportsTeam{
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		this.wins = 0;
		this.losses = 0;
		this.fieldGoals=0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;
	}// end empty-argument constructor

	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(teamName, teamMascot, headCoach);
		this.fieldGoals=7;
		this.fieldGoalsAttempted= 10;
		this.freeThrows=4;
		this.freeThrowsAttempted=7;
	}// end preferred constructor

	public double fieldGoalPercentage() {
		double fgPercentage=fieldGoals/fieldGoalsAttempted;
		return fgPercentage;
	}// end fieldGoalPercentage method
	
	public double freeThrowPercentage() {
		double ftPercentage=freeThrows/freeThrowsAttempted;
		return ftPercentage;
	}// end freeThrowPercentage method

	@Override
	public double[] getStats() {
		double[] thisArray = { getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage() };
		
		double [] statArray = thisArray;
		
		return statArray;
	}// end getStats
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		
		this.wins=wins;
		this.losses=losses;
		this.fieldGoals=fieldGoals;
		this.fieldGoalsAttempted=fieldGoalsAttempted;
		this.freeThrows=freeThrows;
		this.freeThrowsAttempted=freeThrowsAttempted;
	}// end setStats
	
}// end class
