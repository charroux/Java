# Java

---- TP1 à faire pour le 15/11 ---------------

Pour tous les exercices, il faut afficher les résultats avec des System.out.println(...).

Ecrire une classe appelée MinMax qui contient un programme principal déterminant :
  - la plus petite valeur dans un tableau d'entiers (créer le tableau et initialisez le avec autant d'instructions qu'il y a de cases)
  - la plus grande valeur dans un tableau de flottants (créer le tableau et initialisez le en une seule instruction)
  
Ecrire une classe appelée Caractere réalisant :
  - comptage du nombre de lettre a dans un tableau de caractères (faire les trois boucles : for, while, do... while)
  
Ecrire une classe appelée Statistique réalisant (utiliser des tableaux) :
  - la calcul de la moyenne des notes d'un élève (initialisez le tableau avec des nombres aléatoires (chercher sur internet comment on fait)
  - le calcul de l'écart type des notes de l'élève

Ecrire une classe appelée Eleves qui contient un tableau de String (chaîne de caractères représentant des noms) et initialisez le tableau avec un boucle qui demande la saisie des noms au clavier (chercher sur le web comment on fait des saisie clavier).

---- TP2 à faire pour le 21/11 ---------------

Re-écrire la classe Statistique du TP1 en :
 - créant un constructeur intialisant le tableau (déclaré en tant que donnée privée) avec des nombres aléatoires
 - ajouter un deuxième  constructeur qui reçoit en argument un tableau de notes et qui intialise le tableau privé avec
 - mettre le calcul de la moyenne dans une fonction qui retourne la moyenne
 - mettre le calcul de l'écart type dans une fonction qui retourne l'écart-type et qui fait appel à la moyenne
 - écrire une classe appelée Main contenant un programme principal qui utilise les fonctions ci-dessus
 
Créer une classe Eleve contenant comme données un nom et une note. Ajoutez à cette classe un constructeur initialisant le nom et la note. Ajoutez à la classe les fonctions get et set qui permettent de retourner et de modifier les valeurs des données nom et porte (voir https://github.com/charroux/Java/blob/master/src/tp2/MonDossierMedical.java). 

Créer une autre version de la classe Statistique appelée StatistiqueEcole qui contient les mêmes fonctions que la classe Statistique mais qui manipule un tableau d'élèves au lieu d'un tableau de note.

---- TP3 à faire pour le 28/11 ---------------

- Créer une classe appelée Voiture ayant comme données : une marque et un nombre de portes.
- Créer une classe appelée Conducteur ayant commme données le nom du conducteur.
- Ajoutez comme donnée de la classe Voiture un conducteur.
- Créer une classe appelée Passager ayant comme données le nom de passager.
- Aoutez comme données de la classe Voiture un tableau de passagers (utiliser la classe ArrayList de Java pour créer le tableau de passagers https://openclassrooms.com/courses/apprenez-a-programmer-en-java/les-collections-d-objets) 

Remarque : les classes doivent avoir des constructeurs et des fonctions get et set pour toutes les données des classes.


---- TP4 à faire pour le 29/11 ---------------

Consigne gérérale : toutes les classes doivent avoir des constructeurs, des accesseurs (méthodes get et set), ainsi que la fonction toString

- Créer une classe Animal ayant comme attribut un poids et un nom
- Créer une classe Chien qui hérite de Animal. La classe  Chien a pour attribut le nom du propriétaire du Chien.
- Ecrivez une classe Main contenant un programme principal qui :
  - afficher  le nom du chien, son poids et le nom de maître
  - définir une  instance d’Animal
  - définir deux autres instances de Chien
  - définir un tableau contenant les 4 instances ci-dessus
  - afficher les noms des 4 animaux dans une boucle
- Créer une classe Chat qui hérite de Animal. La classe Chat a pour attribut sa race.
- Rendre abstraite  la classe Animal définie précédemment en ajoutant une méthode abstraite manger().
- Reprendre et compléter les classes Chien et Chat et Utilisation de manière à ce que les messages 'Le chien mange du Pal' et 'Le chat mange du Ronron' s'affichent correctement.
- Définir une classe Zoo ayant un attribut de type List pour une liste d'animaux (juste une référence)
- Ajoutez à la classe Zoo un constructeur permettant d'allouer la mémoire pour cette référence
- une méthode d'ajout d'un animal dans le zoo
- Testez la classe Zoo dans le main

---- TP5 à faire pour le 5/12 ---------------

Le but de cet exercice est de définir une classe PolyLine qui représente une ligne brisée définie par une succession de points. On souhaite que des PolyLine différentes puissent être définies par un nombre de points tous différents donc sans doublon. Pour définir les points de la 
PolyLine on définira une méthode add qui permet d'ajouter un point à la PolyLine.

Pour tout l'exercice vous ecrirez un main de test dans la classe PolyLineTest.

Indication les points seront stockés dans une classe implémentant l'interface set afin déviter les doublons (voir la Javadoc).
  - écrire le constructeur ainsi que la méthode add()
  - Générer automatiquement les méthodes toString, hashcode, equals. Modifier la méthode toString afin d'obtenir par exemple la chaîne ((3 4) (7,5) (19, 2) pour une polyne composée es 3 points (3 4),  (7,5) et (19, 2)
  - Ecrire une méthode pointCount qui renvoie le nombre de points constituant actuellement la PolyLine
  - Ecrire une méthode contains qui renvoie vrai si le point passé en argument est un des points constitutifs de la PolyLine
  - Que se passe t'il si l'on fait un contains avec null en argument ? Et un add avec null en argument ?

---- TP6 à faire pour le 6/12 ---------------

Soit la classe Compte (voir le package tp6) qui représente un compte bancaire.
- Ecrire les méthodes conformément aux commentaires du code.
- Ecrire un programme principale qui test tous les cas d'erreurs

Créer une classe Banque qui a commme argument une table de hachage (Hashatable) ayant pour clef le nom d'un détenteur de compte et en valeur un objet de type Compte. Ajoutez à cette classe une fonction appelée creerCompte qui reçoit en argument le nom d'un détenteur et le solde initial du compte et qui ajoute un compte dans la table de hachage. Cette fonction doit lancer une exception si le nom est null ou si le compte est créé avec un solde invalide. Compléter le main avec l'utilisation de la classe Banque. Ajoutez à la classe Banque une fonction appelée getCompte qui reçoit en argument le nom du détenteur de compte et qui retourne le compte correspondant.


---- TP7 ---------------

Compléter le programme de la classe tp7.GestionFichier pour lire et afficher à l'écran toutes les lignes d'un fichier
