
abstract class SportsTeam {
	
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	
	public SportsTeam() {
		
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		this.wins = 0;
		this.losses = 0;
		
	}// end empty-argument constructor

	public SportsTeam(String teamName, String teamMascot, String headCoach) {

		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		this.wins = 11;
		this.losses = 6;
	}// end preferred constructor

	public double getWinPercentage() {
		double winPercentage = wins/(wins + losses);
		return winPercentage;
	}// end getWinPercentage
	
	abstract double[] getStats();
		
	
} //end class
