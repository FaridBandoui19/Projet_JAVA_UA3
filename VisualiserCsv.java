
// Objectif : parcourir un CSV, l’afficher en “tableau” dans la console et compter les valeurs manquantes.
// On utilise BufferedReader pour lire le fichier ligne par ligne et String.split pour séparer les valeurs.

import java.io.*; // tous les éléments du package, pour lire le fichier (FileReader, BufferedReader), gérer les erreurs d’E/S.
import java.util.*; // tous les éléments du package, pour utiliser List, ArrayList.

public class VisualiserCsv {
    public static void main(String[] args) {
        String cheminFichier = "C:\\Users\\hp\\github\\Projet_JAVA_UA3\\donnees_brutes.csv";

        List<String[]> donnees = new ArrayList<>();
        int nbValeursManquantes = 0;
        int ligneNum = 0;

        // Ouverture du fichier et lecture ligne par ligne
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            System.out.println("Contenu du fichier CSV :\n");

            while ((ligne = br.readLine()) != null) {
                ligneNum++;
                String[] valeurs = ligne.split(",", -1);
                donnees.add(valeurs);

                // Affichage “tableau” + détection des manquants
                // Affichage "tableau"
                System.out.printf("Ligne %2d : ", ligneNum);
                for (int i = 0; i < valeurs.length; i++) {
                    String val = valeurs[i].trim();
                    // Test valeur manquante
                    if (val.isEmpty() || val.equalsIgnoreCase("N/A")) {
                        System.out.print("[MANQUANT]\t");
                        nbValeursManquantes++;
                    } else {
                        System.out.print(val + "\t");
                    }
                }
                System.out.println();
            }
            // Gestion des erreurs
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
            return;
        }

        // Statistiques finales

        System.out.println("\nNombre total de valeurs manquantes détectées : " + nbValeursManquantes);
        System.out.println("Nombre de lignes lues : " + donnees.size());
        System.out.println("\nExemple: Les valeurs affichées comme [MANQUANT] sont à traiter lors du nettoyage.");
    }
}