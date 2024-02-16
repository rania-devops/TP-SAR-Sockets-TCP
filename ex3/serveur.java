package ex3;

import java.io.*;
import java.net.*;

public class serveur {
    private static int clientCounter = 0;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Serveur en attente de connexion...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connecté.");

                // Flux de sortie pour envoyer l'identifiant du client
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());

                // Flux d'entrée pour recevoir les données de la personne du client
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());

                // Attente de la réception des données de la personne depuis le client
                Person personFromClient = (Person) in.readObject();
                System.out.println("Données de la personne reçues du client : " +
                        "Nom : " + personFromClient.getName() +
                        ", Âge : " + personFromClient.getAge());

                // Envoi de l'identifiant du client au client
                out.writeInt(clientCounter);
                out.flush();

                // Incrémentation de l'identifiant du client pour le prochain client
                clientCounter++;

                // Fermeture des flux et du socket pour ce client
                in.close();
                out.close();
                clientSocket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
