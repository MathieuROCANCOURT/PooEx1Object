/**
 * 
 */
public class Person {
	private String lastName;
	private String firstName;
	private int old;
	private String address;
	private City bornCity;

	/**
	 * @param lastName
	 * @param firstName
	 * @param old
	 * @param adress
	 */
	public Person(String lastName, String firstName, int old, String address, City bornCity) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = address;
		this.bornCity = bornCity;
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
		this.bornCity = null;
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
		this.bornCity = null;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + this.lastName + ", firstName=" + this.firstName + ", age=" + this.old
				+ ", address=" + this.address + "] Born" + this.bornCity;
	}
}
