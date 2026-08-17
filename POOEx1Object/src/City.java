/**
 * 
 */

/**
 * 
 */
public class City {
	private String name;
	private String country;
	private int nbInhabitants;

	/**
	 * @param name
	 * @param country
	 * @param nbInhabitants
	 */
	public City(String name, String country, int nbInhabitants) {
		this.name = name;
		this.country = country;
		this.nbInhabitants = nbInhabitants;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the nbInhabitants
	 */
	public int getNbInhabitants() {
		return nbInhabitants;
	}

	/**
	 * @param nbInhabitants the nbInhabitants to set
	 */
	public void setNbInhabitants(int nbInhabitants) {
		this.nbInhabitants = nbInhabitants;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 450000);

		System.out.println(toulouse.getNbInhabitants());
		toulouse.setNbInhabitants(toulouse.getNbInhabitants() + 20000);
		System.out.println(toulouse.getNbInhabitants());
	}
}
