import java.util.ArrayList;
import java.util.List;

public class StreamOfStudentGroup {
    private String streamName;
    private List<Student> studentGroupList;

    public StreamOfStudentGroup(String streamName) {
        this.streamName = streamName;
        this.studentGroupList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentGroupList.add(student);
    }

    public List<Student> getStudentGroupList() {
        return studentGroupList;
    }
}