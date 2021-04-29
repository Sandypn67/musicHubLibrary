package musichub.main;

import musichub.business.*;
import musichub.util.*;

public interface IMusicController {

   public void setMusicArtiste(String art);
   public String getMusicArtiste();
   
   public void setMusicTitre(String tit);
   public String getMusicTitre();
   
   public void setMusicDuree(int dur);
   public int getMusicDuree();
   
   public void setMusicID(String id);
   public String getMusicID();
   
   public void setMusicGenre(Genre gen);
   public Genre getMusicGenre();
   
}
