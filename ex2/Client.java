package ex2;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connexion au serveur
            Socket socket = new Socket("localhost", 12345);

            // Flux de sortie pour envoyer des objets au serveur
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            // Flux d'entrée pour recevoir des objets du serveur
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            // Création de la voiture côté client
            voiture myCar = new voiture("Sedan", "ModelXYZ");
            myCar.setCarburant(30);

            // Envoi de la voiture au serveur
            out.writeObject(myCar);

            // Attente de la réception de la voiture modifiée depuis le serveur
            voiture modifiedCar = (voiture) in.readObject();
            System.out.println("Voiture modifiée reçue du serveur : " + modifiedCar.getCarburant() + " litres de carburant");

            // Fermeture des flux et de la socket
            out.close();
            in.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
