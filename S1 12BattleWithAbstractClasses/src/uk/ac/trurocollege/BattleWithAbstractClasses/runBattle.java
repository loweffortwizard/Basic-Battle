package uk.ac.trurocollege.BattleWithAbstractClasses;

public class runBattle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Wizard gts = new Wizard();
		gts.name = "G the Small";
		gts.attack = 1;
		gts.magicFactor = 5;
		gts.defence = 299;
		gts.currentDefence = gts.defence;
		
		Monster jtk = new Monster();
		jtk.name = "Joey the Kangaroo";
		jtk.attack = 8;
		jtk.fearFactor = 15;
		jtk.defence = 228;
		jtk.currentDefence = jtk.defence;
		
		while (jtk.currentDefence >0 && gts.currentDefence>0){
		
		gts.setcurrentAttack();
		jtk.setcurrentAttack();
		
		gts.setcurrentDefence(jtk.currentAttack);
		jtk.setcurrentDefence(gts.currentAttack);
		
		System.out.println(gts.name + " is left with " + gts.currentDefence);
		System.out.println(jtk.name + " is left with " + jtk.currentDefence);
		
		}
		
		if (gts.currentDefence > jtk.currentDefence){
		System.out.println(gts.name + " wins");
		}
		else
		{
		System.out.println(jtk.name + " wins");	
		}

	}

}
