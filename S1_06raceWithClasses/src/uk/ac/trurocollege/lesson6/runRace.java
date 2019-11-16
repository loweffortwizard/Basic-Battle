package uk.ac.trurocollege.lesson6;

public class runRace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racer rts = new Racer();
		rts.name = ("Richard the Speedy");
		rts.speed = (5);
		
		Racer rif = new Racer();
		rif.name = ("Ryan is Fast");
		rif.speed = (6);
		
		int theDistance = (400);
		rts.miles = theDistance;
		rif.miles = theDistance;
		
		
		
		while ( (rif.miles>0) && (rts.miles>0) )
		{
			rts.setCurrentSpeed();
			rif.setCurrentSpeed();
			
			System.out.println(rts.name + " miles remaining: " + rts.miles);
			System.out.println(rif.name + " miles remaining: " + rif.miles);
			System.out.println();
			
			System.out.println(rts.name + " current speed: " + rts.currentSpeed);
			System.out.println(rif.name + " current speed: " + rif.currentSpeed);
			System.out.println();
			
			rts.setMiles();
			rif.setMiles();
			
			System.out.println(rts.name + " miles remaining: " + rts.miles);
			System.out.println(rif.name + " miles remaining: " + rif.miles);
			System.out.println();
			
		}
		
	}

}
