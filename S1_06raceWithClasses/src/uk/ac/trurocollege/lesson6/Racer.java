package uk.ac.trurocollege.lesson6;

import java.util.Random;

public class Racer {
	public String name;
	public int speed;
	public int currentSpeed;
	public int miles;
	
	//setters
	public void setCurrentSpeed(){
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(10);
		
		currentSpeed = randomNumber * speed;
	}
	
	public void setMiles(){
		miles = miles - currentSpeed;
	}
}
