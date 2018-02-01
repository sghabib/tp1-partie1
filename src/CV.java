public class CV {

	public String nom, prenom, formation, attentes;
	public int experienceTravail; // en nombre d'années
	public String[] competences;

	public CV(String nom, String prenom, String formation, String attentes,
			int experienceTravail, String[] competences) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.attentes = attentes;
		this.experienceTravail = experienceTravail;
		this.competences = competences;
	}

	public static void main(String[] args) {
		System.out.println("Bienvenue chez Barrette!");
	}

	public void affiche() {
		System.out.println("Nom :\t" + nom + "\r\n" + "Prenom :\t" + prenom
				+ "\r\n" + "Formation :\t" + formation + "\r\n"
				+ "Années d'experience :\t" + experienceTravail + "\r\n"
				+ "Competences :\t");
		for (int i = 0; i < competences.length; i++) {
			System.out.print(competences[i]);

			if (i != competences.length) {
				System.out.print(", ");
			}
		}

		System.out.println("\r\nAttente :\t" + attentes);
	}
}
