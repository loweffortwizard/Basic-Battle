package uk.ac.trurocollege.BattleWithAbstractClasses;

import java.util.Random;

public class Wizard extends Warrior {
	
	public int magicFactor;
	
	public void setcurrentAttack (){
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(10);
		currentAttack = (randomNumber * attack) + magicFactor;
	}

}
