package fr.iutvalence.java.tp.tilepuzzle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.GridLayout;

public class interfacedisparition implements Affichage
{
		
		  public static void main(String[] args)
		  {
		    JFrame fenetre = new JFrame();
		    fenetre.setTitle("* Disparition *");
		    fenetre.setSize(800, 800);
		    fenetre.setLocationRelativeTo(null);		    
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    fenetre.setVisible(true);

		    fenetre.setLayout(new GridLayout(3,3));
		    fenetre.getContentPane().add(new JButton("1"));
		    fenetre.getContentPane().add(new JButton("2"));
		    fenetre.getContentPane().add(new JButton("3"));
		    fenetre.getContentPane().add(new JButton("4"));
		    fenetre.getContentPane().add(new JButton("5"));
		    fenetre.getContentPane().add(new JButton("6"));
		    fenetre.getContentPane().add(new JButton("7"));
		    fenetre.getContentPane().add(new JButton("8"));
		    fenetre.getContentPane().add(new JButton("9"));
		    fenetre.setVisible(true);
	  }

		@Override
		public void afficherDemandePosition() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afficherPlateau(Plateau plateau) {
			// TODO Auto-generated method stub
			
		}     

	}

