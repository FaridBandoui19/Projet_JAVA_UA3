import java.io.*;
import java.util.*;

public class CsvFileWriter implements ICsvWriter {
    @Override
    public void write(String path, List<String[]> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erreur d'écriture du fichier : " + e.getMessage());
        }
    }
}