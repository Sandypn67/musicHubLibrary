package musichub.business;

import java.util.*;
import musichub.util.*;

/**
*	Cette classe utilise la classe abstraite nommée Gestion et implémente ses méthodes.
*	On utilise alors le mot clé extends car Gestion est en réalité la classe mère de ce menu
*	d'options.
*/

public class Options extends Gestion {
	int vitesse;	//attribut de valeur de vitesse
	String quality;	//attribut de chaine permettant d'avoir un niveau de qualité.
	
	/*Constructeur du menu*/
	public Options(){
		vitesse = 1;
        	quality = "480p";
    	}
	public void menu(){
        Scanner scanner = new Scanner(System.in);	// objet permettant de récupérer le choix de l'utilisateur
        /*Menu d'options*/
            System.out.println("---------------MENU OPTIONS-------------------");
            System.out.println("Si vous voulez : .... =>tappez ...");
            System.out.println("Augmenter la qualité de lecture.                                           => a ");
            System.out.println("Diminuer la qualité de lecture.                                           => d ");
                System.out.println("Augmenter la vitesse de lecture.                                           => p ");
            System.out.println("Diminuer la vitesse de lecture.                                           => m ");
        /*récupération du choix*/
        String touche = scanner.nextLine();

        switch(touche)	//boucle de choix en fonction de la touche récupérée
        {
            case "a":
                bestQuality();	//on augmente la qualité
                break;			//on revient au menu = 'casse' la boucle

                case "d":
                lessQuality();	//baisse la qualité
                break;

                case "p":
                moreSpeed();		//augmente la vitesse de lecture
                break;

                case "m":
                lessSpeed();		//diminue la vitesse de lecture
                break;
        }

    	}
	
	/*methodes utilisées pour changer les options*/
	public void bestQuality(){
		this.quality = "720p";
		/**
		*	On change le niveau de qualité en changeant la valeur de l'attribut
		*	'qualité'.
		*	Le mot-clé this est utilisé ici pour faire référence à l'attribut de sa
		*	qualité. C'est la même méthode que l'on utilise pour vitesse.
		*/
		System.out.println("Vous avez augmenté la qualité à "+this.quality);
		/*On affiche à la console la nouvelle qualité d'écoute*/
	}
	public void lessQuality(){
		this.quality = "360p";
		System.out.println("Vous avez diminué la qualité à "+this.quality);
		/*On affiche à la console la nouvelle qualité d'écoute*/
	}
	public void moreSpeed(){
		this.vitesse = vitesse ++;  
		/* On augmente la qualité en incrémentant de 1 la vitesse possible d'écoute*/
		System.out.println("Vous avez augmenté la vitesse à "+this.vitesse);
		/*On affiche à la console la nouvelle vitesse d'écoute*/
	}
	public void lessSpeed(){
		this.vitesse = vitesse --;
		System.out.println("Vous avez diminué la vitesse à "+this.vitesse);
		/*On affiche à la console la nouvelle vitesse d'écoute*/
	}
}
