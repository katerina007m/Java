import java.util.List;

public class StreamService {
    public static void sortStreams(List<StreamOfStudentGroup> streamList, StreamComparator comparator) {
        streamList.sort(comparator);
    }
}