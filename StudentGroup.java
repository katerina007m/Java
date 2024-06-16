import java.util.Iterator;
import java.util.List;
import java.util.ArrayList; // Добавим импорт для ArrayList

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;
    private List<StreamOfStudentGroup> streamList; // Добавляем список потоков

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
        this.streamList = new ArrayList<>(); // Инициализируем список потоков
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentList);
    }

    public List<StreamOfStudentGroup> getStreamList() {
        return streamList;
    }

    public void addStream(StreamOfStudentGroup stream) {
        streamList.add(stream); // Добавляем объект stream в список потоков
    }
}