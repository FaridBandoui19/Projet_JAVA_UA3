import java.util.List;

// definit une interface pour l'écriture de fichiers CSV
public interface ICsvWriter {
    void write(String path, List<String[]> data);
}