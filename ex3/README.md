**Rapport sur l'Exercice 3 - Application Client-Serveur avec Échange de Données sur les Personnes :**

**Introduction :**

L'objectif de cet exercice était de développer une application client-serveur basique où le client envoie des informations sur des personnes au serveur. Ces informations sont composées de l'âge de la personne (un entier) et son nom (une chaîne de caractères). À chaque envoi d'informations, le serveur retourne un entier correspondant à l'identificateur du client.

**Implémentation de la solution :**

La solution a été implémentée en utilisant deux programmes distincts, le serveur (`Serveur`) et le client (`Client`), pour permettre la communication bidirectionnelle.

**Partie Serveur (Serveur) :**

Le serveur a été conçu pour écouter les connexions clientes sur le port 12345. Lorsqu'une connexion est établie, il reçoit les informations sur une personne du client, génère un identificateur unique pour le client, puis renvoie cet identificateur au client.

**Partie Client (Client) :**

Le client se connecte au serveur et envoie des informations sur une personne, composées de l'âge et du nom, au serveur. Il attend ensuite la réception de l'identificateur retourné par le serveur et l'affiche.

**Tests réalisés :**

1. **Test sur la même machine :**
   - Les programmes serveur et client ont été exécutés avec succès sur la même machine.
   - L'échange d'informations sur les personnes a fonctionné conformément aux attentes.
   - La communication bidirectionnelle a été vérifiée avec succès.

2. **Test sur deux machines distantes :**
   - Les adresses IP appropriées ont été utilisées pour configurer le client et le serveur.
   - Le serveur a été lancé sur une machine, et le client sur une autre machine connectée au réseau.
   - L'application a réussi à échanger des informations sur les personnes même à travers le réseau.

**Conclusion :**

Cet exercice a permis de mettre en œuvre une application client-serveur simple avec l'échange d'informations sur les personnes. La communication entre le client et le serveur a été établie avec succès, et les données ont été échangées de manière cohérente. 