
/**
 * 
 */
import javax.management.RuntimeErrorException;

/**
 * Class city to create with the country and the number of inhabitants.
 * 
 * @author RocancourtM
 */
public class City {
	/** Count the number of instances of City. */
	private static int nbCity = 0;

	private String name;
	private String country = "unknown";
	private int nbInhabitants = 0;

	/**
	 * Constructor with name of city, the country and the number of inhabitants.
	 * 
	 * @param name          City name.
	 * @param country       Country where is the city.
	 * @param nbInhabitants Number of inhabitants of the city.
	 */
	public City(String name, String country, int nbInhabitants) {
		this.name = name;
		this.country = country;
		setNbInhabitants(nbInhabitants);
		nbCity++;
	}

	/**
	 * Constructor with name of city and the country .
	 * 
	 * @param name    City name.
	 * @param country Country where is the city.
	 */
	public City(String name, String country) {
		this.name = name;
		this.country = country;
		nbCity++;
	}

	/**
	 * Constructor with name of city and the number of inhabitants.
	 * 
	 * @param name          City name.
	 * @param nbInhabitants Number of inhabitants of the city.
	 */
	public City(String name, int nbInhabitants) {
		this.name = name;
		this.nbInhabitants = nbInhabitants;
		nbCity++;
	}

	/**
	 * Get the city name.
	 * 
	 * @return City name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get back the country from the city.
	 * 
	 * @return the country.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Get the number of inhabitants.
	 * 
	 * @return Number of inhabitants.
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
	 * @return
	 */
	public static int getNbCity() {
		return nbCity;
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
