/**
 * 
 */
public class TestCity {
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
