package uk.ac.trurocollege.BattleWithAbstractClasses;

import java.util.Random;

public class Monster extends Warrior {
	
	public int fearFactor;
	
	public void setcurrentAttack (){
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(10);
		currentAttack = (randomNumber * attack) + fearFactor;
	}

}
