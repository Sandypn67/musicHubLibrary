package test;
import musichub.*;

import static org.junit.jupiter.api.Assertions.*;

import musichub.business.Server;
import musichub.main.MusicHub;
import musichub.util.Chanson;
import musichub.util.Genre;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

class ServerTest{
	MusicHub hub = new MusicHub();
	LinkedList<Chanson> chansons;

	Server server = new Server();
	private static String ip = "localhost";
	private static int port = 6666;
	private ServerSocket ss;
	private Socket socket;

	private static String ipfaux = "197.125.0.0";
	private static int portfaux = 80;



	@Test
	void testConnexion() {
		/**
		 * test de connexion valide
		 */
			try {
				this.ss = new ServerSocket(port);
				System.out.println("Server waiting for connection...");
				this.socket = ss.accept();//établit la connexion
				System.out.println("Connected as " + ip);
			}catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}
	}

	@Test
	void testConnexionFaux() {
		/**
		 * test de connexion échouant
		 */
		try {
			this.ss = new ServerSocket(portfaux);
			System.out.println("Server waiting for connection...");
			this.socket = ss.accept();//établit la connexion
			System.out.println("Connected as " + ipfaux);
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

	@Test
	void testClose(){
		/**
		 * test de fermeture du socket : valide
		 */
		try{
			server.closeSocket();
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}

	@Test
	void testPlsConnexion() {
		/**
		 * test de connexion multiples sur differents port avec differentes ip
		 */
		try {
			this.ss = new ServerSocket(1967);
			System.out.println("Server waiting for connection...");
			this.socket = ss.accept(); //établit la connexion
			System.out.println("Connected as " + "81.220.22.142");
			this.ss = new ServerSocket(port);
			System.out.println("Server waiting for connection...");
			this.socket = ss.accept(); //établit la connexion
			System.out.println("Connected as " + ip);
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
