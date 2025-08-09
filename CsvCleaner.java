import java.util.List;
import java.util.ArrayList;

public class CsvCleaner {
    private final ICsvReader reader;
    private final ICsvWriter writer;
    private final IRowCleaner rowCleaner;

    // Injection de dépendances au constructeur
    public CsvCleaner(ICsvReader reader, ICsvWriter writer, IRowCleaner rowCleaner) {
        this.reader = reader;
        this.writer = writer;
        this.rowCleaner = rowCleaner;
    }

    public void cleanCsv(String inputPath, String outputPath) {
        List<String[]> data = reader.read(inputPath);

        List<String[]> cleaned = new ArrayList<>();
        for (String[] row : data) {
            cleaned.add(rowCleaner.clean(row));
        }

        writer.write(outputPath, cleaned);
    }
}