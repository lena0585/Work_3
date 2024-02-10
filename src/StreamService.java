import java.util.Comparator;
import java.util.List;

public class StreamService {
    public void sortStream (List<Stream> streamList) {
        streamList.sort((Comparator<? super Stream>) new StreamComporator());
    }
}