package counter;

import java.util.Observable;

/**
 * Print the counter value on the console whenever it changes.
 * @author Korawit Rupanya
 */
public class ConsoleView implements java.util.Observer {
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}

	/**
	 * The observer method to observe the info that come from the user.
	 */
	@Override
	public void update(Observable subject, Object info) {
		if( info != null) {
			System.out.println(info);
		}
		System.out.println("Count: "+counter.getCount());
	}
}
