/*	6. Create a class named App that has a main method.
 * 		a. In this class instantiate an instance of each of your logger classes that implement the Logger interface.
 * 		b. Test both methods on both instances, passing in Strings of your choice.
 */

package week5;

public class App {

	public static void main(String[] args) {

		Logger star = new AsteriskLogger();
		Logger space = new SpacedLogger(); 

		star.log("colocho");
		star.error("thisisanexampletoshowthelenght");
		space.log("colocho");
		space.error("colocho");
	}
}
/* Class "App" created with a main method
 * an instance of "AsteriskLogger" called "star" and an instance of "SpacedLogger" called "space" are instantiated.
 * then, using the same String, both "star" and "space" instances of the Logger classes are used with both "log" and "error" methods each following the specifications in the Logger classes. 
 */