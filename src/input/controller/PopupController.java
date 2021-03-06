package input.controller;

import input.view.PopupDisplay;
import input.model.Thingy;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thingy myTestThing;
	
	public PopupController ()
	{
		myPopups = new PopupDisplay();
	}
	
 public void start()
 {
	 String myName = myPopups.grabAnswer("Type in your name");
	 myPopups.showResponse("You typed in: " + myName);
	
	 String temp = myPopups.grabAnswer("Type in your age");
		int myAge = Integer.parseInt(temp);
		myPopups.showResponse("You typed " + myAge);
		
		String tempWeight = myPopups.grabAnswer("Type in your weight");
		double myWeight = Double.parseDouble(tempWeight);
		myPopups.showResponse("You typed " + myWeight);
		
	myTestThing = new Thingy(myName, myAge, myWeight);
 
	
	while(!isInteger(temp))
	{
		temp = myPopups.grabAnswer("Type in a positive integer for your age!!!");
	}
	
	if(isInteger(temp))
	{
		myAge = Integer.parseInt(temp);
	}
	else
	{
		myAge = -9999;
	}
	
 }
 
 private boolean isInteger(String input)
 {
	 boolean isInt = false;
	 
	 try
	 {
		 int temp = Integer.parseInt(input);
		 isInt = true;
	 }
	 catch(NumberFormatException error)
	 {
		 myPopups.showResponse("not an int - bad value will be used");
	 }
	 
	 return isInt;
 }
 
 	private boolean isDouble(String input)
 	{
 		boolean isDouble = false;
 		
 		try
 		{
 			double temp = Double.parseDouble(input);
 			isDouble = true;
 		}
 		catch(NumberFormatException error)
 		{
 			myPopups.showResponse("Not a double - bad value will be used");
 		}
 		
 		return isDouble;
 		
 		
 	}	
}