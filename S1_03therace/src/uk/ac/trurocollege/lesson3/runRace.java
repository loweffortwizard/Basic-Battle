package uk.ac.trurocollege.lesson3;

import java.util.Random;

public class runRace {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name1 = ("Parky the Swift");
		int speed1 = (5);
		int currentSpeed1;
		int miles1;
		
		String name2 = ("Andy the tall");
		int speed2 = (7);
		int currentSpeed2;
		int miles2;
		
		int theDistance = (30);
		miles1 = theDistance;
		miles2 = theDistance;
		
		Random randomGenerator = new Random();
		
		while ( (miles1>0) && (miles2>0) )
		{
			int randomNumber = randomGenerator.nextInt(5);
			currentSpeed1 = speed1 * randomNumber;
			
			randomNumber = randomGenerator.nextInt(10);
			currentSpeed2 = speed2 * randomNumber;
			
			System.out.println (name1 + " has a current speed of " + currentSpeed1);
			System.out.println (name2 + " has a current speed of " + currentSpeed2);
			System.out.println("");
			Thread.sleep(1000);
			
			miles1 = miles1 - currentSpeed1;
			miles2 = miles2 - currentSpeed2;
			
			System.out.println (name1 + " has " + miles1 + " miles left");
			System.out.println (name2 + " has " + miles2 + " miles left");
			System.out.println("");
			Thread.sleep(1000);
		}
		
		
		if (miles1 > miles2)
		{
		System.out.println (name2 + " wins the race");	
		}
		
		else if (miles2 > miles1)
		{
		System.out.println (name1 + " wins the race");	
		}
		
		else
		{
		System.out.println ("It's a draw");	
		}		
		
		
		
		
		
	}

}
