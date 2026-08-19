/**
 * A person has a first name and a last name. Age, address, and city of born are
 * optional.
 * 
 * @author RocancourtM
 */
public class Person {
	private String lastName;
	private String firstName;
	private int old;
	private String address;
	private City bornCity;

	/**
	 * Create a person with last name, first name, age, address and city of birth.
	 * 
	 * @param lastName  Last name.
	 * @param firstName First name.
	 * @param old       Age.
	 * @param address   Address of the person.
	 * @param bornCity  City of birth.
	 */
	public Person(String lastName, String firstName, int old, String address, City bornCity) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = address;
		this.bornCity = bornCity;
	}

	/**
	 * Create a person with last name, first name and age.
	 * 
	 * @param lastName  Last name.
	 * @param firstName First name.
	 * @param old       Age.
	 */
	public Person(String lastName, String firstName, int old) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = old;
		this.address = "unknown";
		this.bornCity = null;
	}

	/**
	 * Create a person with last name and first name.
	 * 
	 * @param lastName  Last name.
	 * @param firstName First name.
	 */
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.old = 0;
		this.address = "unknown";
		this.bornCity = null;
	}

	/**
	 * Check if the character is born in France.
	 * 
	 * @return true if born city is France, else false.
	 */
	public boolean bornFrance() {
		return this.bornCity.getCountry().contains("France");
	}

	public boolean inParis() {
		return this.address.contains("Paris");
	}

	@Override
	public String toString() {
		String display = this.lastName + " , " + this.firstName + " , " + this.old + " , habitant " + this.address;

		if (this.bornCity != null) {
			display += " , Ville de naissance : " + this.bornCity.getName() + " , " + this.bornCity.getCountry();

			if (this.bornCity.getNbInhabitants() != 0) {
				display += " , population " + this.bornCity.getName() + " " + this.bornCity.getNbInhabitants()
						+ " d'habitants";
			}
		}

		return display;
	}
}
