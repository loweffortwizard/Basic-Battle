package uk.ac.trurocollege.lesson2;

import java.util.Random;

public class runBattle {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Ready for battle");
		System.out.println("");
		Thread.sleep(1000);
		
		String name1 = ("Kendle the Krazy");
		int attack1 = (4);
		int currentAttack1;
		int health1 = (99);
		
		String name2 = ("Liam the Llama");
		int attack2 = (6);
		int currentAttack2;
		int health2 = (80);
		
		Random randomGenerator = new Random();
		
		while ( (health1>0) && (health2>0) )
		{
			int randomNumber = randomGenerator.nextInt(10);
			currentAttack1 = attack1 * randomNumber;
			
			randomNumber = randomGenerator.nextInt(10);
			currentAttack2 = attack2 * randomNumber;
			
			System.out.println (name1 + " has a current attack of " + currentAttack1);
			System.out.println (name2 + " has a current attack of " + currentAttack2);
			System.out.println("");
			Thread.sleep(1000);
			
			health1 = health1 - currentAttack2;
			health2 = health2 - currentAttack1;
			
			System.out.println (name1 + " has a health of " + health1);
			System.out.println (name2 + " has a health of " + health2);
			System.out.println("");
			Thread.sleep(1000);
		}
		
		
		if (health1 > health2)
		{
		System.out.println (name1 + " wins the battle");	
		}
		
		else if (health2 > health1)
		{
		System.out.println (name2 + " wins the battle");	
		}
		
		else
		{
		System.out.println ("It's a draw");	
		}
		
		
		
	}
		
		
		
}

