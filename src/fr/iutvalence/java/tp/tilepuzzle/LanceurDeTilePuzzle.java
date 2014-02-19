package fr.iutvalence.java.tp.tilepuzzle;

/**
 * @author Bouix Loïc et Sanfilippo Max
 */

/**
 * Classe initiale de l'application, permet de lancer la partie.
 */
public class LanceurDeTilePuzzle
{
	/**
	 * Methode initiale, crée la partie et affiche son 
	 * état(en création, démarrage ou terminé)
	 * @param args Arguments de la ligne de commande, il n'y en a aucun pour
	 * l'instant.
	 */
	public static void main(String[] args)
	{
		System.out.println("Création de la partie");
		TilePuzzle partieDeTilePuzzle = new TilePuzzle();
		System.out.println("Demarrage de la partie");
		partieDeTilePuzzle.jouer();
		System.out.println("Fin de la partie");
	}
}
