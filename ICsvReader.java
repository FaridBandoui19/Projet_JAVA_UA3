import java.util.List;

// definit une interface pour la lecture de fichiers CSV
public interface ICsvReader {
    List<String[]> read(String path);
}