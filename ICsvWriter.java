import java.util.List;

public interface ICsvWriter {
    void write(String path, List<String[]> data);
}