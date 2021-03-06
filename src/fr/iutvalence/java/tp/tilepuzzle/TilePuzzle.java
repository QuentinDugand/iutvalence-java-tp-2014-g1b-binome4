package fr.iutvalence.java.tp.tilepuzzle;

/**
 * Classe principale du jeu, initialise la partie en créant un plateau et un joueur.
 */
public class TilePuzzle
{

	/**
	 * Plateau
	 */
	private final Plateau plateau;
	
	/**
	 * Joueur
	 */
	private final Joueur joueur;
	
	/**
	 * Support d'affichage
	 */
	private final Affichage affichage;
	
	/**
	 * Crée une partie prête à être jouée.
	 * Cela implique la mise en place d'un plateau et d'un joueur pour cette partie.
	 * @param joueur Joueur a utiliser
	 * @param fdp Fabrique de plateau utilisée pour la partie
	 * @param affichage Affichage a utiliser
	 */
	public TilePuzzle(Joueur joueur, FabriqueDePlateau fdp, Affichage affichage)
	{
		// TODO définir des constantes
		this.plateau = fdp.obtenirPlateauDefini(3, 3, 10);
		this.joueur = joueur;
		this.affichage = affichage;
	}

	/**
	 * Lance la partie
	 */
	public void jouer()
	{
		while (this.plateau.obtenirNombreDeCasesAllumees() < this.plateau.obtenirHauteur()*this.plateau.obtenirLargeur())
		{
			this.affichage.afficherPlateau(this.plateau);
			this.affichage.afficherDemandePosition();
			this.plateau.inverserCasesAutourDe(this.joueur.getPosition(this.plateau.obtenirHauteur(),this.plateau.obtenirLargeur()));
		}
	}
}
