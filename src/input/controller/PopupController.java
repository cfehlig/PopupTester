package input.controller;

import input.view.PopupDisplay;

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
	String temp = myPopups.grabAnswer("Type in your name");
	myPopups.showResponse("You typed in: " + myName);
	
	String temp = myPopups.grabAnswer("type in your age")
	int myAge = Integer.parseInt(temp);
	myPopups.showResponse("You typed " + myAge);
	double myWeight = myPopups.grabAnswer(")
	 
	 myTestThing = new Thingy(myName, myage, myWeight);
 }
 
 private boolean is Integer(String input)
 {
	 boolean isInt = false;
	 
	 try
	 {
		 int temp = Integer.parseInt(input);isInt = true;
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
 		
 		return isDouble;
 	}
}
