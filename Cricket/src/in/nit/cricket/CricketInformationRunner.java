package in.nit.cricket;

public class CricketInformationRunner {

	public static void main(String[] args) {
		System.out.println("Match Details");
		
		CricketInformation cricket=new CricketInformation();
		System.out.println("CricketInformation"+cricket);
		  cricket.teamName="Royal challengers bangalore";
          cricket.batsManName="MK Deepak";
		    cricket.bowlerName="Syed miskin quadri";
		    cricket.umpireName="Faizan ahmed";
             cricket.numberOfTeams=10;
		    cricket.battingCoach="yaqoob";
		    cricket.bowlingCoach="amir";
		    cricket.venue="NIT";
		    cricket.matchBetween="RCB VS MI";
		    cricket.wonTheMatchBy="RCB";
		    System.out.println("Teamname:"+cricket.teamName);
		    System.out.println("Btasman name:"+cricket.batsManName);
		    System.out.println("BowlerName:"+cricket.bowlerName);
		    System.out.println("umpire:"+cricket.umpireName);
		    System.out.println("NOT:"+cricket.numberOfTeams);
		    System.out.println("Battingcoach:"+cricket.battingCoach);
		    System.out.println("Bowling coach:"+cricket.bowlingCoach);
		    System.out.println("venue:"+cricket.venue);
		    System.out.println("Matchbetween:"+cricket.matchBetween);
		    System.out.println("Winner:"+cricket.wonTheMatchBy);
		    

		

	}

}
