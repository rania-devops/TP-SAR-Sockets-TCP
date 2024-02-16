**Rapport sur l'Exercice 1 - Développement d'un serveur TCP/IP :**

**1.  les Classes SocketClient et SocketServeur :**

Les classes `SocketClient` et `SocketServeur` sont des programmes Java qui implémentent respectivement un client et un serveur TCP/IP. 

- **Côté Serveur (SocketServeur) :**
  - Le programme commence par demander à l'utilisateur d'entrer le port d'écoute.
  - Un `ServerSocket` est créé pour écouter les connexions entrantes sur le port spécifié.
  - Lorsqu'un client se connecte, le serveur crée des flux de sortie et d'entrée pour communiquer avec le client.
  - Le serveur lit une chaîne de caractères envoyée par le client, l'affiche, puis envoie une réponse au client.

- **Côté Client (SocketClient) :**
  - Le programme demande à l'utilisateur d'entrer le nom du serveur et le port du serveur.
  - L'adresse IP du serveur est obtenue à partir du nom du serveur.
  - Un `Socket` est créé pour se connecter au serveur sur le port spécifié.
  - Des flux de sortie et d'entrée sont créés pour communiquer avec le serveur.
  - Le client envoie une chaîne de caractères au serveur, lit la réponse du serveur et l'affiche.

**2. Tests des Programmes :**

- **Les deux programmes se trouvant dans la même machine :** (vous trouvez aussi une capture d ecran)
  - Les programmes sont lancés dans deux fenêtres de terminal distinctes sur la même machine.
  - Les interactions entre le client et le serveur sont effectuées avec succès.
  - Le serveur affiche l'adresse et le port du client et renvoie une réponse.

- **Les deux programmes dans deux machines distantes :**
  - Le serveur est lancé sur une machine distante, et le client est lancé sur une autre machine.
  - Le client est configuré avec l'adresse IP ou le nom du serveur distant.
  - Les interactions entre le client et le serveur sont réalisées avec succès sur des machines distantes.

**3. Schéma des Flux de Messages :**

une photo du schema est inserée dans le dossier de l ex1

**Conclusion :**

Cet exercice a permis de développer une compréhension pratique des concepts de base des sockets TCP/IP en Java. Les programmes client et serveur ont été testés avec succès dans différentes configurations, démontrant ainsi leur fonctionnalité. 