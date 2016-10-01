//Name: Kyle Moore
//UFL ID: 2977-6819
//Section: 1146
//Project Number: 1
//A program that calculates the possibility of capturing a monster based on user input.
import java.util.Scanner;
import java.lang.Math;
public class CaptureCalculator 
{
public static void main(String[] args)
{
	System.out.println("Hello and welcome to the Monster Capture Possibility Calculator.");
//monster console
	System.out.println("Please enter the latitude of the monster (1-10): ");
	Scanner input = new Scanner(System.in);	
		int monsterLocationY = input.nextInt();
	System.out.println("Please enter the longitude of the monster (1-10): ");
		int monsterLocationX = input.nextInt();
	System.out.println("Please enter the time of the monster appear (1-1440):");
		int appearTime = input.nextInt();
	System.out.println("Please enter the possible time of the monster will exist (10-59):");
		int possibleExistTime = input.nextInt();
//player console
	System.out.println("Please enter the player's ID (8 digits):");
		int playerID = input.nextInt();
	System.out.println("Please enter the time of the player noticing monster (1-1440 and greater than the time the monster appears):");
		int playerNoticeTime = input.nextInt();
	System.out.println("Please enter the latitude of the player (1-10): ");
		int playerLocationY = input.nextInt();
	System.out.println("Please enter the longitude of the player (1-10): ");
		int playerLocationX = input.nextInt();
	System.out.println("Please enter the player's walking speed (10-200): ");
		int playerWalkSpeed = input.nextInt();
//Determine the player’s state What type of player he/she is (“lucky list” vs. “normal list”)
//lucky id ends in 00 to 49
//unlucky id 50 to 99
	int playerID1 = playerID %100;

	boolean playerLuck;
	if (playerID1 > 49)
	{
		playerLuck = false;
	}
	else
		playerLuck = true;
//When the player will arrive at the monster location 
// X's
	double xDist = (monsterLocationX - playerLocationX);
	xDist = xDist * 1000;
	double squaredX = Math.pow(xDist,2);
// Y's
	double yDist = (monsterLocationY - playerLocationY);
	yDist = yDist * 1000;
	double squaredY = Math.pow(yDist,2);
//both	
	double xAndY = squaredX + squaredY;
	double distance = Math.sqrt(xAndY);
	distance = Math.round(distance*10)/10.0;
//arrival time
	double arrivalTime = playerNoticeTime + (distance/playerWalkSpeed);
	arrivalTime = Math.round(arrivalTime*10)/10.0;
//Whether he/she is late or not; if they are late, what percentage it is
	double luckPercentage = 0;
	int monsterDisappear = appearTime + possibleExistTime;	
		luckPercentage = (((arrivalTime - (monsterDisappear)) / possibleExistTime)* 100);	
	if (playerLuck == true)
		System.out.println("Player " + playerID + " who is on the lucky list, ");
	else
	System.out.println("Player " +  playerID + " who is on the normal list, ");
	System.out.println("noticed the monster at time " + playerNoticeTime + ", ");
	System.out.println("is " +  distance + " m away from the monster, ");
	System.out.println("and will arrive at time " + arrivalTime + ". ");
	System.out.println("The monster's disappear time is about " + monsterDisappear + ". ");
	//lucky list
	if (playerLuck == true)
	{
			if (luckPercentage < 0)
				System.out.println("So the player will capture this monster with definitely possibility.");
			else if (luckPercentage <= 10)
				System.out.println("So the player will capture this monster with highly likely possibility.");
			else if  (luckPercentage <= 30)
				System.out.println("So the player will capture this monster with likely possibility.");
			else if (luckPercentage <= 40)
				System.out.println("So the player will capture this monster with unsure possibility.");
			else if (luckPercentage <= 50)
				System.out.println("So the player will capture this monster with unlikely possibility.");
			else if (luckPercentage > 50)
				System.out.println("So the player will capture this monster with highly unlikely possibility.");		
	}
	//unlucky
	else
		{
			if (luckPercentage < 0)
				System.out.println("So the player will capture this monster with definitely possibility.");
			else if (luckPercentage <= 5)
				System.out.println("So the player will capture this monster with highly likely possibility.");
			else if  (luckPercentage <= 20)
				System.out.println("So the player will capture this monster with likely possibility.");
			else if (luckPercentage <= 35)
				System.out.println("So the player will capture this monster with unsure possibility.");
			else if (luckPercentage <= 40)
				System.out.println("So the player will capture this monster with unlikely possibility.");
			else if (luckPercentage > 40)
				System.out.println("So the player will capture this monster with highly unlikely possibility.");			
		}	
}
}
