# Projet Java : Nettoyage de données CSV

## Membres du groupe
- Farid Bandoui
- Akram Zerdaoui

## Description
Ce projet vise à développer un outil Java pour nettoyer un fichier CSV : gestion des valeurs manquantes, standardisation des textes et sauvegarde.

## Structure du projet
- `Farid.txt` : Dossier personnel de Farid
- `Akram.txt` : Dossier personnel d’Akram
- `contributions.txt` : Répartition des tâches
- `README.md` : Ce fichier de description du projet.
- `donnes_brutes.csv`: fichier CSV, généré pour le projet.
- `Main.java`: Point d’entrée du programme qui crée les objets nécessaires et lance le nettoyage du CSV.
- `ICsvReader.java`: Interface qui définit la méthode pour lire un fichier CSV.
- `ICsvWriter.java`: Interface qui définit la méthode pour écrire un fichier CSV.
- `IRowCleaner.java`: Interface qui définit la méthode pour nettoyer une seule ligne du CSV.
- `CsvFileReader.java`: Implémentation de ICsvReader qui lit un fichier CSV ligne par ligne et retourne les données.
- `CsvFileWriter.java`: Implémentation de ICsvWriter qui écrit les données dans un fichier CSV.
- `CsvCleaner.java`: Classe qui orchestre la lecture, le nettoyage et l’écriture du CSV.
- `BasicRowCleaner.java`: Implémentation de IRowCleaner qui remplace ou supprime les valeurs manquantes et standardise le texte.
- `VisualiserCsv.java` : Classe responsable de l'affichage ou de la visualisation des données CSV.

## Utilisation

Pour utiliser cet outil de nettoyage CSV, suivez ces étapes :

- Placez les fichiers : Mettez toutes les interfaces et classes fournies dans le même projet Java.

- Configurez les chemins de fichiers :

    - Ouvrez Main.java et VisualiseCsv.java.

    - Modifiez les variables inputPath et outputPath avec les chemins de votre fichier CSV d'entrée et du fichier de sortie souhaité.

- Exécutez le programme : Lancez l'exécution du programme. Il effectuera les actions suivantes :

    - Lecture automatique du fichier CSV.

    - Remplacement ou suppression des valeurs manquantes.

    - Standardisation du texte.

    - Enregistrement des données nettoyées dans le nouveau fichier.