import java.io.*;
import java.util.*;

public class CsvFileWriter implements ICsvWriter {
    @Override // indique qu’on implémente la méthode de l’interface.
    public void write(String path, List<String[]> data) {

        // try-with-resources : ferme automatiquement le fichier à la fin ou en cas
        // d’erreur.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // Ouverture du fichier en écriture
            for (String[] row : data) { // Parcours des lignes de données
                bw.write(String.join(",", row)); // joint les valeurs avec des virgules
                bw.newLine(); // ajoute une nouvelle ligne
            }
            // Gestion des erreurs
        } catch (IOException e) {
            System.err.println("Erreur d'écriture du fichier : " + e.getMessage());
        }
    }
}