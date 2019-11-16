package uk.ac.trurocollege.lesson5;

import java.util.Random;

public class Monster extends Warrior {
	
	public int fearFactor;
	
	public void setCurrentAttack(){
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(10);
		
		currentAttack = (randomNumber * attack) + fearFactor;
	}

}
