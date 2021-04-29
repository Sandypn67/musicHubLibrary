package musichub.main;

import musichub.business.*;
import musichub.util.*;
import java.util.*;

public class MusicView implements IMusicView {
	
   IMusicModel model;
   IMusicController controller;

   MusicHub hub = new MusicHub();
   
   public MusicView(IMusicController controller, IMusicModel model) {
        this.controller = controller;
        this.model = model;
        this.model.registerObserver(this);
        this.interactionConsole();
   }	   
   
   public void update(String musicInfo){
	  System.out.println("New elements on your MusicHub: \n"+ musicInfo);	  
   }
 
   
   public void interactionConsole() {
   
   	System.out.println("If you want to add a song type 's', for a book type 'b'.");
   	Scanner scan = new Scanner(System.in);
   	String clavier = scan.nextLine();
   	switch(clavier)	//boucle de choix en fonction de la touche récupérée
        {
            case "s":
                hub.ajoutChansons();
                break;
                
            case "b":
                hub.ajoutLivreAudio();
                break;
                
            default:
                System.out.println("Isn't the good letter, please retry.");
                break;
        }
    }
}
