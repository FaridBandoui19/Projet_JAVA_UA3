# 🛠 Projet Java – Outil de Nettoyage et Visualisation de Données CSV
## 👥 Membres du groupe
Farid Bandoui – Lecture et visualisation des données, rédaction du rapport.

Akram Zerdaoui – Implémentation du nettoyage et de l’écriture, organisation du code.

## 📌 Description
Ce projet a pour objectif de développer un outil Java permettant de :

Lire un fichier CSV ligne par ligne.

Détecter et remplacer les valeurs manquantes.

Standardiser les textes (par exemple, en majuscules).

Sauvegarder les données nettoyées dans un nouveau fichier.

Visualiser les données brutes directement dans la console.

Il illustre également de bonnes pratiques de conception comme :

Séparation des responsabilités

Utilisation d’interfaces

Injection de dépendances (principe DIP de SOLID)

## 📂 Structure du projet
```.
├── donnees_brutes.csv        # Fichier CSV d'entrée
├── donnees_nettoyees.csv     # Fichier CSV généré après nettoyage
├── Main.java                 # Point d'entrée du programme
├── VisualiserCsv.java        # Affichage et comptage des valeurs manquantes
├── ICsvReader.java           # Interface pour la lecture CSV
├── ICsvWriter.java           # Interface pour l'écriture CSV
├── IRowCleaner.java          # Interface pour le nettoyage d'une ligne
├── CsvFileReader.java        # Implémentation de ICsvReader
├── CsvFileWriter.java        # Implémentation de ICsvWriter
├── CsvCleaner.java           # Orchestration lecture → nettoyage → écriture
├── BasicRowCleaner.java      # Nettoyage basique (valeurs manquantes / majuscules)
├── Farid.txt                 # Dossier personnel
├── Akram.txt                 # Dossier personnel
└── contributions.txt         # Répartition des tâches
```

## 🔄 Schéma de fonctionnement
```
flowchart TD
    A[donnees_brutes.csv] -->|Lecture| B[CsvFileReader]
    B -->|Lignes en mémoire| C[BasicRowCleaner]
    C -->|Lignes nettoyées| D[CsvFileWriter]
    D --> E[donnees_nettoyees.csv]

```

## 🚀 Utilisation
### 1. Préparer le projet
Placer tous les fichiers .java et le fichier CSV d'entrée dans le même projet Java.

Vérifier que le projet compile correctement dans votre IDE ou en ligne de commande.

### 2. Configurer les chemins
Dans Main.java et VisualiserCsv.java, modifier :
```
String inputPath = "chemin/vers/donnees_brutes.csv";
String outputPath = "chemin/vers/donnees_nettoyees.csv";

```
### 3. Compiler et exécuter
#### En ligne de commande :
```
javac *.java
java Main

```

#### En IDE :

Ouvrir Main.java et exécuter.

## 📊 Exemple d’entrée/sortie
### Fichier CSV d'entrée (donnees_brutes.csv) :
```
Nom,Pays,Score
Jean,France,15
Marie,,20
Ali,N/A,17

```

### Fichier CSV nettoyé (donnees_nettoyees.csv) :
```
NOM,PAYS,SCORE
JEAN,FRANCE,15
MARIE,INCONNU,20
ALI,INCONNU,17

```

## ⚠️ Limitations actuelles
Le découpage CSV se base sur split(",") et ne gère pas les champs contenant des virgules entre guillemets.

L’encodage utilisé est celui par défaut du système (préférer UTF-8 pour éviter les problèmes avec les caractères spéciaux).

Les chemins sont actuellement codés en dur.

### 📌 Améliorations possibles
Utiliser un parseur CSV robuste (par ex. OpenCSV) pour gérer les cas complexes.

Passer les chemins de fichiers en arguments de ligne de commande.

Ajouter des options de nettoyage plus avancées (normalisation par colonne, suppression de doublons, etc.).

Gérer l'encodage en UTF-8 de manière explicite.

