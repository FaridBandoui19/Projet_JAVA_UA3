import java.io.*;
import java.util.*;

public class CsvFileReader implements ICsvReader {
    @Override
    public List<String[]> read(String path) {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] vals = line.split(",", -1); // -1 pour garder les vides
                rows.add(vals);
            }
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        }
        return rows;
    }
}