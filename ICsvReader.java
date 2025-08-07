import java.util.List;

public interface ICsvReader {
    List<String[]> read(String path);
}