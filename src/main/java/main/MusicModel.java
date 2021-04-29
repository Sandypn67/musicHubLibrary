package musichub.main;

import musichub.business.*;
import musichub.util.*;
import java.util.*;

public class MusicModel implements IMusicModel {

    private String artiste;
    protected String titre;	//attribut commun à tout nos éléments audio de type String
    protected String ID;
    private String contenu; // (fichier audio) => trouver le type
    private Genre genre;
    private int duree;
    private List<IMusicView> observers = new ArrayList<IMusicView>();
    
    public MusicModel(){
        this.titre = "Blizzard";
        this.artiste = "Fauve";
        this.duree = 290;
        this.ID = "000.000.001";
        this.contenu = "MP3";
        this.genre = genre.POP;
        
    }
    
    public void registerObserver (IMusicView o) {
        observers.add(o);
    }    
    
    public void removeObserver (IMusicView o){
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }    
    public void notifyObservers (){
        for (IMusicView o : observers) {
            o.update(this.artiste + " " + this.titre+ " " + this.duree+ " " + this.ID+ " " + this.genre);
        }
    }    
    public String getArtiste(){
        return this.artiste;
    }    
    public String getTitre(){
        return this.titre;
    } 
    public int getDuree(){
        return this.duree;
    }    
    public String getID(){
        return this.ID;
    }
    public Genre getGenre(){
        return this.genre;
    }    

    public void setArtist(String a){
        this.artiste = a;
        notifyObservers();
    }    
    public void setTitre(String t){
        this.titre = t;
        notifyObservers();
    }    
    public void setId(String i){
        this.ID = i;
        notifyObservers();
    }    
    public void setGenre(Genre g){
        this.genre = g;
        notifyObservers();
    }
    public void setDuree(int d){
        this.duree = d;
        notifyObservers();
    }
}
