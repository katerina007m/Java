import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Student student1 = new Student(4, "AAA", "AAA", "AAA");
        Student student2 = new Student(2, "BBB", "BBB", "BBB");
        Student student3 = new Student(1, "Baa", "Baa", "Baa");
        Student student4 = new Student(3, "aaa", "aaa", "aaa");

        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        // Создание потоков
        StreamOfStudentGroup stream1 = new StreamOfStudentGroup("Stream1");
        StreamOfStudentGroup stream2 = new StreamOfStudentGroup("Stream2");

        // Добавление студентов в потоки
        stream1.addStudent(student1);
        stream1.addStudent(student2);

        stream2.addStudent(student3);
        stream2.addStudent(student4);

        // Добавление потоков в группу потоков
        studentGroup.addStream(stream1);
        studentGroup.addStream(stream2);

        StudentGroupService service = new StudentGroupService(studentGroup);
        printListStudent(service.getSortedStudentGroupByFIO());

        int groupsInStream1 = stream1.getStudentGroupList().size();
        int groupsInStream2 = stream2.getStudentGroupList().size();

        System.out.println("Количество групп в потоке 1: " + groupsInStream1);
        System.out.println("Количество групп в потоке 2: " + groupsInStream2);

        if(groupsInStream1 == groupsInStream2) {
            System.out.println("Количество групп в обоих потоках одинаково.");
        } else {
            System.out.println("Количество групп в потоках различается.");
        }
    }

    static void printListStudent(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}