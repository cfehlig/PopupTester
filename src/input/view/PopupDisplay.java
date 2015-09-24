package input.view;

import javax.swing.JOptionPane;
/**
 * a popup display class used for owing input and output.
 * @author Cassandra Fehlig
 * @version 1 09/24/15
 */

public class PopupDisplay
{
	public void owResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}

	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
}
