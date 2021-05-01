package test;
import musichub.*;

import static org.junit.jupiter.api.Assertions.*;

import musichub.main.MusicHub;
import musichub.util.Chanson;
import musichub.util.Genre;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class MusicHubTest{
	MusicHub hub = new MusicHub();
	LinkedList<Chanson> chansons;

	@Test
	void testDateAlbumFaux(){
		/**
		 * test de validité des dates des albums
		 */
		try{
			hub.verifDate("16554-56-23");
			hub.verifDate("201i-12-23");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}

	@Test
	void testAddChanson() {
		/**
		 * test de d'ajout manuel d'une chanson au repertoire du musicHub
		 */
		try{
			System.out.println("Création de la Chanson :");
			Chanson crea_song = new Chanson("Mr. Brightside","The Killers" ,123,"000.000.021","MP3", Genre.POP);
			chansons.add(crea_song);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}

	@Test
	void testAddChansonFaux() {
		/**
		 * test de d'ajout d'une chanson échouant car valeur nulle et ID errone
		 */
		try{
			System.out.println("Création de la Chanson :");
			Chanson crea_song = new Chanson(null,"The Killers" ,123,"000.000.01256","MP3", Genre.POP);
			chansons.add(crea_song);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}

	@Test
	void testDateAlbum() {
		/**
		 * test de datation d'un album : correct
		 */
		try{
			hub.verifDate("2011-04-23");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}

	@Test
	void testAffichage() {
		/**
		 * test d'affichage des chansons des albums : correct
		 */
		try{
			hub.affchanson_album();
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}

	}

}
