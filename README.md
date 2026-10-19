# Travaux Pratiques Java — Exercices 1 à 6

## Description
Ce dépôt contient six exercices de programmation en Java permettant de pratiquer les boucles, les tableaux, les matrices et les algorithmes.

## Liste des exercices

### Exercice 1 : Série harmonique
Calculer la somme des `n` premiers termes de la série harmonique :

`S = 1 + 1/2 + 1/3 + ... + 1/n`

**Notions utilisées :**
- Lecture au clavier avec `Scanner`
- Boucle `for`
- Variables de type `double`

### Exercice 2 : Triangle isocèle
Afficher un triangle isocèle formé d'étoiles (`*`), selon une hauteur `n` saisie par l'utilisateur.

**Notions utilisées :**
- Boucles imbriquées
- Affichage avec `print()` et `println()`
- Gestion des espaces et des étoiles

### Exercice 3 : Carrés des nombres impairs
Créer un tableau contenant les carrés des `n` premiers nombres impairs, puis afficher chaque nombre avec son carré.

**Notions utilisées :**
- Tableaux à une dimension
- Boucle `for`
- Calcul des nombres impairs et de leurs carrés

### Exercice 4 : Tableaux à deux dimensions
Créer une classe utilitaire contenant des méthodes statiques pour manipuler des tableaux de `double`.

**Méthodes réalisées :**
- `affiche(double[][] t)` : afficher le tableau.
- `regulier(double[][] t)` : vérifier si toutes les lignes ont la même taille.
- `sommeLignes(double[][] t)` : calculer la somme de chaque ligne.
- `somme(double[][] t1, double[][] t2)` : additionner deux tableaux réguliers de mêmes dimensions.

Un programme de test permet de vérifier le fonctionnement des méthodes.

### Exercice 5 : Rotation d'une matrice
Lire une matrice carrée d'entiers `N × N` et effectuer une rotation de 90° dans le sens horaire, sans créer de second tableau.

**Méthode utilisée :**
1. Transposer la matrice.
2. Inverser chaque ligne.

**Notions utilisées :**
- Matrices
- Échanges de valeurs
- Algorithmes en place
- Complexité temporelle `O(N²)`
- Mémoire supplémentaire `O(1)`

### Exercice 6 : Fenêtre glissante
Calculer le nombre de valeurs distinctes dans chaque fenêtre de taille `k` d'un tableau d'entiers.

**Méthode utilisée :**
- Tableau de fréquences `freq`
- Technique de la fenêtre glissante
- Mise à jour du nombre de valeurs distinctes lors de chaque déplacement

**Complexité :**
- Temps : `O(n + MAXV)`
- Mémoire : `O(n + MAXV)`

## Technologies utilisées
- Langage : Java
- Environnement de développement : Eclipse
- Entrées : `Scanner`
- Structures utilisées : tableaux, matrices et boucles

## Objectifs pédagogiques
- Maîtriser les boucles et les conditions.
- Manipuler les tableaux à une et deux dimensions.
- Développer la logique algorithmique.
- Comprendre les échanges de valeurs et les algorithmes en place.
- Analyser la complexité temporelle et spatiale.

## Auteur
Travaux pratiques réalisés dans le cadre de l'apprentissage du langage Java.

<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/aeb60850-a8a4-4f06-afb8-c69bd1e0408c" />
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/59e0b457-febd-4bcc-b8a6-201875f9e649" />
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/15535587-f39e-448e-bd28-a2925ed6dee0" />
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/d3ca7f6a-ab87-4696-b3c3-eb14a8e287ba" />
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/069fccc2-3155-4c6d-a5df-22d9c8876491" />
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/0f34693c-3091-475f-89be-63af9f7dada6" />
