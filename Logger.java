/*	1. Create an interface named Logger.
 * 	2. Add two void methods to the Logger interface, each should take a String as an argument
 * 		a.  log
 * 		b.  error 
 */

package week5;

public interface Logger {

	public void log(String str); 
	public void error(String str);

}
/*	Interface "Logger" created and two abstract methods added (their body is defined in the classes that implement this interface): "log" that takes a String as argument and does not return anything; and "error" that also takes a String as argument and does not return anything either. */