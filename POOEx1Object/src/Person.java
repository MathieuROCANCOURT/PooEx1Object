/**
 * 
 */
public class Person {
	private String lastName;
	private String firstName;
	private String old;
	private String adress;

	/**
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param adress
	 */
	public Person(String lastName, String firstName, String old, String adress) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.adress = adress;
	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param old
	 */
	public Person(String lastName, String firstName, String old) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.adress = "unknown";
	}

	/**
	 * @param lastName
	 * @param firstName
	 */
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = "unknown";
		this.adress = "unknown";
	}

	
}
