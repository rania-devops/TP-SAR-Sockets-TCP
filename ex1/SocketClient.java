package ex1;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SocketClient {


	    public static void main(String argv[]) {
	        int port = 0;
	        String host = "";
	        Scanner keyb = new Scanner(System.in);

	        // Demander à l'utilisateur de saisir le nom du serveur et le port
	        System.out.print("Nom du serveur : ");
	        host = keyb.next();
	        System.out.print("Port du serveur : ");
	        try {
	            port = keyb.nextInt();
	        } catch (NumberFormatException e) {
	            System.err.println("Le second paramètre n'est pas un entier.");
	            System.exit(-1);
	        }

	        try {
	            // Obtenir l'adresse IP du serveur
	            InetAddress adr = InetAddress.getByName(host);

	            // Créer un socket client et se connecter au serveur
	            Socket socket = new Socket(adr, port);

	            // Initialiser les flux de sortie et d'entrée
	            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
	            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

	            // Envoyer une chaîne de caractères au serveur
	            output.writeObject(new String("Ma première socket"));

	            // Lire une réponse du serveur
	            String chaine = (String) input.readObject();
	            System.out.println("Reçu du serveur : " + chaine);

	        } catch (Exception e) {
	            System.err.println("Erreur : " + e);
	        }
	    }
	}


