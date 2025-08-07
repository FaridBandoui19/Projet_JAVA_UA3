import java.io.*;
import java.util.*;

public class VisualiserCsv {
    public static void main(String[] args) {
        String cheminFichier = "C:\\Users\\hp\\github\\Projet_JAVA_UA3\\donnees_brutes.csv"; // à adapter si besoin

        List<String[]> donnees = new ArrayList<>();
        int nbValeursManquantes = 0;
        int ligneNum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            System.out.println("Contenu du fichier CSV :\n");

            while ((ligne = br.readLine()) != null) {
                ligneNum++;
                String[] valeurs = ligne.split(",", -1); // -1 : ne pas ignorer les vides
                donnees.add(valeurs);

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
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
            return;
        }

        System.out.println("\nNombre total de valeurs manquantes détectées : " + nbValeursManquantes);
        System.out.println("Nombre de lignes lues : " + donnees.size());
        System.out.println("\nExemple: Les valeurs affichées comme [MANQUANT] sont à traiter lors du nettoyage.");
    }
}