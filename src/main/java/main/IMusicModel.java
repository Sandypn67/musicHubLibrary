package musichub.main;

import musichub.business.*;
import musichub.util.*;

public interface IMusicModel {

    public void registerObserver (IMusicView o);
    public void removeObserver (IMusicView o);
    public void notifyObservers ();
    public String getArtiste();
    public String getTitre();
    public int getDuree();
    public String getID();
    public Genre getGenre();
    public void setArtist(String a);
    public void setTitre(String t);
    public void setId(String i);
    public void setGenre(Genre g);
    public void setDuree(int d);
}
