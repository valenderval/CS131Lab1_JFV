import java.security.SecureRandom;

	/**
	 * This is our NonPlayer Character that inherits
	 * from GameCharacter it represent objects the game controls 
	 * (as opposed to objects a human player controls).
	 * @author 
	 * @version 1.3
	 * Lab1
	 * CS131ON
	 */

	public class NonPlayerCharacter extends GameCharacter{
		
		private boolean active;
		
		private String intelligenceType;
		
		public NonPlayerCharacter() {
			
			super();
			this.setActive(false);
			this.setIntelligenceType("AVERAGE");
			
		}// end empty-argument constructor

		public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType ) {
		
			super(uniqueID, personality);
			this.setActive(active);
			this.setIntelligenceType(intelligenceType);
		}//end preferred constructor

		
		@Override
		public String reportStructure() {

			StringBuilder sb = new StringBuilder("==================================\n");
			sb.append("UniqueID: "+getUniqueID()+"\n");
			sb.append("Personality: "+getPersonality()+"\n");
			sb.append("==================================\n");
			sb.append("Active: "+isActive()+"\n");
			sb.append("Intelligence: "+getIntelligenceType()+"\n");
			sb.append("==================================\n");
			//return sb.toString();
			return sb.toString();
		}//end reportStructure

		
		public String introduce() {
			
			return "Hello, my name is "+getUniqueID();
		}// end introduce method
		
		public String exclaim() {
			
			String[] response= {"Dag Gummit","Doggone it","Holy cow","Jeez","Well cheese and crackers"};
			
	        SecureRandom sr = new SecureRandom();

	        int randomIndex = sr.nextInt(response.length);

	        String randomResponse=response[randomIndex];
	        
			return randomResponse;
		
		}// end exclaim method
		
		public boolean isActive() {
			
			return active;
		}//end isActive

		public void setActive(boolean active) {
			this.active = active;
		}//end setActive

		public String getIntelligenceType() {
			return intelligenceType;
		}//end getIntelligenceType

		public void setIntelligenceType(String intelligenceType) {
			this.intelligenceType = intelligenceType;
		}//end setIntelligenceType
		

	}//end class
