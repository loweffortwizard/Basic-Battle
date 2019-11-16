package uk.ac.trurocollege.lesson5;

import java.util.Random;

public class Warrior {
	
	public String name;
	public int attack;
	public int currentAttack;
	public int defence;
	public int currentDefence;
	
	//setters
	public void setCurrentAttack(){
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(10);
		
		currentAttack = randomNumber * attack;
	}
	
	//method for setCurrentAttack
	public void setCurrentDefence(int theAttack){
		currentDefence = currentDefence - theAttack;
		//RESIVING THE VALUE
	}

}
