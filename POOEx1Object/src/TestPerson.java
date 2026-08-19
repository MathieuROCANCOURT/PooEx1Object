/**
 * Class to test Person constructors and methods.
 * 
 * @author RocancourtM
 */
public class TestPerson {
	/**
	 * Main program
	 * 
	 * @param args Arguments to command line.
	 */
	public static void main(String[] args) {
		/** Create list of personalities. */
		Person manu = new Person("Macron", "Emmanuel", 43, "Élysée à Paris", new City("Amiens", "France"));
		Person sarko = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2_000_000));
		Person johnson = new Person("Johnson", "Boris", 56, "Downing Street", new City("New York", "USA"));
		Person depardieu = new Person("Depardieu", "Gérard", 72, "Moscou", new City("Châteauroux", "France"));
		Person kravitz = new Person("Kravitz", "Lenny", 56, "Hôtel particulier à Paris", new City("New York", "USA"));
		Person lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA", new City("Indian Hills", "USA"));
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person biden = new Person("Biden", "Joe");

		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);

		Person[] personalitiesList = new Person[] { manu, sarko, johnson, depardieu, kravitz, lawrence };

		System.out.println("Liste des personnalités");
		for (Person person : personalitiesList) {
			System.out.println(person);
		}

		System.out.println("--------------------------------\n" + "Liste après notre filtre");
		for (Person person : personalitiesList) {
			if (person.bornFrance() || person.inParis()) {
				System.out.println(person);
			}
		}
	}

}
