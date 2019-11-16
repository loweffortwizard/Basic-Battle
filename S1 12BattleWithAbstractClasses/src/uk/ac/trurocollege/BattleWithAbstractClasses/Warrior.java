package uk.ac.trurocollege.BattleWithAbstractClasses;

import java.util.Random;

public abstract class Warrior {

	public String name;
	public int attack;
	public int currentAttack;
	public int defence;
	public int currentDefence;
	
	public void setcurrentDefence(int theattack){
		currentDefence = (currentDefence - theattack);
	}
	
	public abstract void setcurrentAttack ();

	
	
}
