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

- Créer une classe Animal ayant comme attribut un poids et un nom
- Ajouter à la classe Animal, un constructeur, des méthodes get et set
- Créer une classe Chien qui hérite de Animal. La classe  Chien a pour attribut le nom du propriétaire du Chien.
- Ajoutez à la classe Chien un contructeur qui reçoit en argument le nom du chien, son poids ainsi que le nom de son maître.
- Ecrivez une classe Main contenant un programme principal qui :
  - afficher  le nom du chien, son poids et le nom de maître
  - définir une  instance d’Animal
  - définir deux autres instances de Chien
  - définir un tableau contenant les 4 instances ci-dessus
  - afficher les noms des 4 animaux dans une boucle
