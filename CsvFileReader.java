import java.io.*;
import java.util.*;

public class CsvFileReader implements ICsvReader {
    // Implémentation de la méthode read
    @Override
    public List<String[]> read(String path) {
        List<String[]> rows = new ArrayList<>(); // liste où chaque élément est un tableau de chaînes représentant une
                                                 // ligne du CSV.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // BufferedReader pour lire le fichier
                                                                             // ligne par ligne

            // Lecture et découpage des lignes
            String line;
            while ((line = br.readLine()) != null) {
                String[] vals = line.split(",", -1); // -1 pour garder les vides
                rows.add(vals);
            }
            // Gestion des erreurs
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        }
        return rows;
    }
}