
/**
 * 
 */

import javax.management.RuntimeErrorException;

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
		setNbInhabitants(nbInhabitants);
	}

	/**
	 * @param name
	 * @param nbInhabitants
	 */
	public City(String name, int nbInhabitants) {
		this.name = name;
		setCountry("unknown");
		this.nbInhabitants = nbInhabitants;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the nbInhabitants
	 */
	public int getNbInhabitants() {
		return nbInhabitants;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param nbInhabitants the nbInhabitants to set
	 */
	public void setNbInhabitants(int nbInhabitants) {
		if (nbInhabitants < 0)
			throw new RuntimeErrorException(null, "Le nombre d'habitant est négatif.");
		this.nbInhabitants = nbInhabitants;
	}

	/**
	 * @param gap
	 */
	public void changeProgressHabitants(int gap) {
		this.setNbInhabitants(this.nbInhabitants + gap);
	}

	@Override
	public String toString() {
		return "ville de " + this.name + " en " + this.country + " ayant " + this.nbInhabitants + " habitants";
	}
}
