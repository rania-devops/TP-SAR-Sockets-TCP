Rapport sur l'Exercice 2 - Échange d'objets de la classe Voiture via des sockets :

Introduction :

L'objectif de cet exercice était de développer une application client-serveur permettant l'échange d'objets de la classe Voiture entre eux via des sockets en Java. La classe Voiture a été conçue avec une méthode permettant de fixer la quantité de carburant.

Implémentation de la solution :

La solution a été implémentée en utilisant deux programmes distincts, le serveur (Serveur) et le client (Client), pour permettre la communication bidirectionnelle.

Partie Serveur (Serveur) :

Le serveur a été conçu pour écouter les connexions clientes sur le port 12345. Lorsqu'une connexion est établie, il reçoit un objet Voiture du client, ajuste la quantité de carburant, puis renvoie l'objet modifié au client.

Partie Client (Client) :

Le client se connecte au serveur et envoie un objet Voiture initialisé au serveur. Il attend ensuite la réception de l'objet Voiture modifié par le serveur et affiche la quantité de carburant après la modification.

Tests réalisés :

Test sur la même machine :

Les programmes serveur et client ont été exécutés avec succès sur la même machine.
L'échange d'objets Voiture a fonctionné conformément aux attentes.
La communication bidirectionnelle a été vérifiée avec succès.
Test sur deux machines distantes :

Les adresses IP appropriées ont été utilisées pour configurer le client et le serveur.
Le serveur a été lancé sur une machine, et le client sur une autre machine connectée au réseau.
L'application a réussi à échanger des objets Voiture même à travers le réseau.
Conclusion :

Cet exercice a permis de mettre en pratique les concepts de communication client-serveur avec des sockets en Java. L'échange d'objets de la classe Voiture a été réussi, démontrant la possibilité de transférer des objets complexes entre des applications via le réseau. La sérialisation des objets a été utilisée pour faciliter cette communication.