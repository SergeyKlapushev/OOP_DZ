import java.io.BufferedWriter;
import java.io.IOException;

public interface Recording {
    void Record(Human human,  BufferedWriter pen)throws IOException;
}