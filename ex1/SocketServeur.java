package ex1;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SocketServeur {

	    public static void main(String argv[]) {
	        int port = 0;
	        Scanner keyb = new Scanner(System.in);

	        // Demander à l'utilisateur de saisir le port d'écoute
	        System.out.print("Port d'écoute : ");
	        try {
	            port = keyb.nextInt();
	        } catch (NumberFormatException e) {
	            System.err.println("Le paramètre n'est pas un entier.");
	            System.err.println("Usage : java SocketServeur port-serveur");
	            System.exit(-1);
	        }

	        try {
	            // Créer un socket serveur
	            ServerSocket serverSocket = new ServerSocket(port);

	            // Attendre qu'un client se connecte
	            Socket socket = serverSocket.accept();

	            // Initialiser les flux de sortie et d'entrée
	            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
	            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

	            // Lire une chaîne de caractères du client
	            String chaine = (String) input.readObject();
	            System.out.println("Reçu : " + chaine);

	            // Afficher l'adresse et le port du client
	            System.out.println("Cela vient de : " + socket.getInetAddress() + ":" + socket.getPort());

	            // Envoyer une réponse au client
	            output.writeObject(new String("Bien reçu ! Ma première socket"));

	        } catch (Exception e) {
	            System.err.println("Erreur : " + e);
	        }
	    }
	

}
