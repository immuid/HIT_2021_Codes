package demo_practice_area;

	import java.util.Random;
	import java.util.Scanner;
	public class Rock                    
	{
		
	public static void main(String[] args)
	{
	 String personPlay=""; //User's play -- "R", "P", or "S"
	 String computerPlay="";
	 //Computer's play -- "R", "P",or "S"
	//Randomly generated number used to determine
	//computer's play
	
	System.out.println("start ");
	 Scanner scan = new Scanner(System.in);
	 personPlay=scan.next();
	 scan.close();
	Random generator = new Random();
	int limit=3;
	int random=generator.nextInt(limit);
	switch(random)
	{
	case 0:	computerPlay="R";
	break;
	case 1:	computerPlay="P";
	break;
	case 2:	computerPlay="S";
	break;
	}
	if(personPlay.equalsIgnoreCase(computerPlay))
	{
		System.out.println("tie...same choice...");
	}
	else if(personPlay.equalsIgnoreCase("R"))
	{
	if(computerPlay.equalsIgnoreCase("S"))
	{
	System.out.println("you won...Rock crashed scicors");
	}
	else {
		System.out.println("retry...you lost to computer you chose rock and computer chose paper");
	}
	}
	else if(personPlay.equalsIgnoreCase("P"))
			{
	if(computerPlay.equalsIgnoreCase("R")) {
		System.out.println("you win...paper escaped from rock");
	}
	else {
		System.out.println("retry...you lost to computer you chose paper and computer chose scissors");}
	}
	else if(personPlay.equalsIgnoreCase("S"))
	{
	if(computerPlay.equalsIgnoreCase("P"))
	{
	System.out.println("you won......scissors cutted paper");}
	else{
		System.out.println("retry....you lost to computer you chose siccor and computer chose rock");
	}
	}
	else {System.out.println("don't be too smart enter between r,s,p......");}
	 
	//Get player's play -- note that this is stored as a string
	//Make player's play uppercase for ease of comparison
	//Generate computer's play (0,1,2)
	//Translate computer's randomly generated play to string
	//Print computer's play
	//See who won. Use nested ifs instead of &&.
	//if (personPlay.equals(computerPlay))
	//System.out.println("It's a tie!");
	//else if (personPlay.equals("R"))
	//if (computerPlay.equals("S"))
	//System.out.println("Rock crushes scissors. You win!!");
	//else {
	//// ... Fill in rest of code
	//}
	 
	 }
	}
	


