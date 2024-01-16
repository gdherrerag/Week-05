/*	3. Create two classes that implement the Logger interface
 * 		a. AsteriskLogger
 * 		b. SpacedLogger
 * 	5. Implement the SpacedLogger methods:
 * 		Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.
 * 		a. If the log method received “Hello” as an argument, it should print H e l l o
 * 		b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
 */

package week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		StringBuilder newstr = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			newstr.append(str.charAt(i));
			if (i < str.length() -1) {
				newstr.append(" ");
			}
		}
		System.out.println(newstr.toString());
	}

	@Override
	public void error(String str) {
		StringBuilder newstr = new StringBuilder("ERROR: ");
		for (int i = 0; i < str.length(); i++) {
			newstr.append(str.charAt(i));
			if (i < str.length() -1) {
				newstr.append(" ");
			}
		}
		System.out.println(newstr.toString());
	}

}

/*	Class "SpacedLogger" created to implement "Logger" interface and inherit the methods' signature from it. Both method bodies are defined with specific characteristics.  
 * 	method "log" takes a string as argument. then, after creating a StringBuilder variable, it uses a for loop that first takes each character of the String and appends it to the StringBuilder variable. an if statement checks if the loop is still running one more time. if it does, it appends and empty space " " to the StringBuilder variable. finally, after the for loop ends, the StringBuilder variable is printed out to the console. 
 *	method "error" also takes a string as argument. then it creates a StringBuilder variable with the initial content "ERROR: " and then follows the same procedure as the "log" method to use a for loop to add each character of the String to the StringBuilder variable with an empty space in between using an if statement to do that. finally, after the for loop ends, the StringBuilder variable is printed out to the console. 
 */