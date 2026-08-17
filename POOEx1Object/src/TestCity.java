/**
 * 
 */
public class TestCity {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", -200);

		System.out.println(toulouse.getNbInhabitants());
		toulouse.setNbInhabitants(-200);
		System.out.println(toulouse.getNbInhabitants());

		System.out.println("Ville: " + toulouse.getName() + ", Pays: " + toulouse.getCountry() + ", Nb. d'habitants: "
				+ toulouse.getNbInhabitants() + ".");
	}
}
