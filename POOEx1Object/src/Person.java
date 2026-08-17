/**
 * 
 */
public class Person {
	private String lastName;
	private String firstName;
	private int old;
	private String address;

	/**
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param adress
	 */
	public Person(String lastName, String firstName, int old, String address) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = address;
	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param old
	 */
	public Person(String lastName, String firstName, int old) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = "unknown";
	}

	/**
	 * @param lastName
	 * @param firstName
	 */
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = 0;
		this.address = "unknown";
	}

	@Override
	public String toString() {
		return "Person [lastName=" + this.lastName + ", firstName=" + this.firstName + ", age=" + this.old
				+ ", address=" + this.address + "]";
	}
}
