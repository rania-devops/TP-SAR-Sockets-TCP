package ex2;
import java.io.*;
import java.net.*;

public class Serveur {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Serveur en attente de connexion...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecté.");

            // Flux de sortie pour envoyer des objets au client
            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());

            // Flux d'entrée pour recevoir des objets du client
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());

            // Attente de la réception de l'objet Voiture depuis le client
            voiture voitureFromClient = (voiture) in.readObject();
            System.out.println("Voiture reçue du client : " + voitureFromClient.getCarburant() + " litres de carburant");

            // Modification de la quantité de carburant côté serveur
            voitureFromClient.setCarburant(50);

            // Envoi de la voiture modifiée au client
            out.writeObject(voitureFromClient);

            // Fermeture des flux et des sockets
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
