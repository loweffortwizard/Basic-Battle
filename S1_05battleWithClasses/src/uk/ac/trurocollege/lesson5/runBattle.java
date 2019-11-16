package uk.ac.trurocollege.lesson5;

public class runBattle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Warrior ktm = new Warrior();
		ktm.name = ("Kendle the Mighty");
		ktm.attack = (5);
		ktm.defence = (100);	
		
		Monster atn = new Monster();
		atn.name = ("Andy the Nothing");
		atn.attack = (7);
		atn.defence = (85);
		atn.fearFactor = (2);
		
		ktm.currentDefence = ktm.defence;
		atn.currentDefence = atn.defence;
		
		while ((ktm.currentDefence > 0) && (atn.currentDefence>0))
		{		
		ktm.setCurrentAttack();
		atn.setCurrentAttack();
		
		System.out.println(ktm.name + " current defence: " + ktm.currentDefence);
		System.out.println(ktm.name + " current attack: " + ktm.currentAttack);
		System.out.println();
		System.out.println(atn.name + " current defence: " + atn.currentDefence);
		System.out.println(atn.name + " current attack: " + atn.currentAttack);
		
		//SENDING PERMAMITERS
		ktm.setCurrentDefence(atn.currentAttack);
		//SENDING VALUE
		atn.setCurrentDefence(ktm.currentAttack);
		//SENDING VALUE
		
		System.out.println();
		System.out.println (ktm.name + " current defence: " + ktm.currentDefence);
		System.out.println(atn.name + " current defence: " + atn.currentDefence);
		}
		
		
		

	}

}
