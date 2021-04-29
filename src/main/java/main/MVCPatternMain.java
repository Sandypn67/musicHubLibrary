package musichub.main;

import musichub.business.*;
import musichub.util.*;

public class MVCPatternMain {

   public void main(String[] args) {
      MusicModel model  = new MusicModel();
      MusicController controller = new MusicController(model);
   }
}
