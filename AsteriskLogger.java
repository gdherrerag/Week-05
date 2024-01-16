/*	3. Create two classes that implement the Logger interface
 * 		a. AsteriskLogger
 * 		b. SpacedLogger
 * 	4. Implement the AsteriskLogger methods:  
 * 		Note:  The AsteriskLogger will use the asterisk or "*".
 * 		a. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
 * 		b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
 * 			****************
 * 			***Error: Hello***
 * 			****************		
 */

package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
	}

	@Override
	public void error(String str) {
		StringBuilder star = new StringBuilder();
		for (int i = 0; i < (12 + str.length()); i++) {
			star.append('*');
		}
		System.out.println(star.toString() + "\n***Error:" + str + "***\n" + star.toString());
	}
}

/*	Class "AsteriskLogger" created to implement "Logger" interface and inherit the methods' signature from it. Both method bodies are defined with specific characteristics.  
 * 	method "log" takes a string and prints it out between 3 stars
 *	method "error" also takes a string and prints it out inside a box of stars. I used a for loop and StringBuilder class to create a String of stars that matches the length of the String in order for the box to have an even presentation when printed out to the console
 */