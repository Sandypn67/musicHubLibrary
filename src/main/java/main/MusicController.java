package musichub.main;

import musichub.business.*;
import musichub.util.*;

public class MusicController implements IMusicController {
   private IMusicModel model;
   private IMusicView view;

   public MusicController(IMusicModel model){
      this.model = model;
      this.view = new MusicView(this, model);
    }

   public void setMusicArtiste(String art){
      this.model.setArtist(art);		
   }

   public String getMusicArtiste(){
      return this.model.getArtiste();		
   }
   
   public void setMusicTitre(String tit){
      this.model.setTitre(tit);		
   }

   public String getMusicTitre(){
      return this.model.getTitre();		
   }
   
   public void setMusicDuree(int dur){
      this.model.setDuree(dur);		
   }

   public int getMusicDuree(){
      return this.model.getDuree();		
   }
   public void setMusicID(String id){
      this.model.setId(id);		
   }

   public String getMusicID(){
      return this.model.getID();		
   }
   
   public void setMusicGenre(Genre gen){
      this.model.setGenre(gen);		
   }

   public Genre getMusicGenre(){
      return this.model.getGenre();		
   }

   public void updateView(){				
      this.view.update(getMusicArtiste() + " " + getMusicTitre()+ " " + getMusicDuree()+ " " + getMusicID()+ " " + getMusicGenre());
   }	
}

