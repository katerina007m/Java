import java.util.Iterator;
import java.util.List;

public class StreamOfStudentGroupIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int index = 0;

    public StreamOfStudentGroupIterator(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return studentGroupList.get(index++);
        }
        return null;
    }
}