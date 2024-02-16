package ex3;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        String serverHost = "localhost";
        int serverPort = 12345;

        try {
            Scanner scanner = new Scanner(System.in);

            // Créer un socket client et se connecter au serveur
            Socket socket = new Socket(serverHost, serverPort);

            // Créer ObjectInputStream et ObjectOutputStream pour la communication
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            // Saisir les informations sur la personne
            System.out.print("Entrez l'âge de la personne : ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Entrez le nom de la personne : ");
            String nom = scanner.nextLine();

            // Créer un objet Person et l'envoyer au serveur
            Person person = new Person(nom, age);
            output.writeObject(person);
            output.flush();

            // Recevoir l'identificateur du client du serveur
            int clientId = input.readInt();
            System.out.println("Identificateur du client reçu du serveur : " + clientId);

            // Fermer la connexion avec le serveur
            socket.close();
        } catch (Exception e) {
            System.err.println("Erreur côté client : " + e);
        }
    }
}
