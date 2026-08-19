/**
 * Class to test City constructor and methods.
 * 
 * @author RocancourtM
 */
public class TestCity {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 200);

		System.out.println(toulouse.getNbInhabitants());
		toulouse.setNbInhabitants(470000);
		System.out.println(toulouse.getNbInhabitants());

		System.out.println("Ville: " + toulouse.getName() + ", Pays: " + toulouse.getCountry() + ", Nb. d'habitants: "
				+ toulouse.getNbInhabitants() + ".");

		toulouse.changeProgressHabitants(-100000);
		System.out.println("Ville: " + toulouse.getName() + ", Pays: " + toulouse.getCountry() + ", Nb. d'habitants: "
				+ toulouse.getNbInhabitants() + ".");

		/** Polymorphism test **/
		City rabatWithoutCountry = new City("Rabat", 577000);
		City rabat = new City("Rabat", "Maroc", 577000);

		System.out.println("[ville : " + rabatWithoutCountry.getName() + "] [pays : " + rabatWithoutCountry.getCountry()
				+ "] [nombre d'habitants : " + rabatWithoutCountry.getNbInhabitants() + "]");
		System.out.println("[ville : " + rabat.getName() + "] [pays : " + rabat.getCountry()
				+ "] [nombre d'habitants : " + rabat.getNbInhabitants() + "]");
		
		/** Test display method **/
		toulouse.setNbInhabitants(450000);
		//toulouse.display();
		
		/** Display the object's reference. **/
		System.out.println(toulouse); // City@2a139a55
		
		/** Display the number of City instances. **/
		System.out.println(City.getNbCity()); // 3
	}
}
