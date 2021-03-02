/**
 * 
 */
package activity;

/**
 * @author 
 *
 */
public class AddWholeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 50; i++) {
			total = total + i;
		}
		System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);

		int total2 = 0;
	    for (int i = 50; i <= 100; i++) {

				total2 = total2 + i;
			}
			System.out.println("Addition of Whole Numbers from 50 to 100 = " + total2);


	}

}
