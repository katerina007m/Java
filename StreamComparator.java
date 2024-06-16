import java.util.Comparator;

// Класс для сравнения потоков студенческих групп по количеству групп
public class StreamComparator implements Comparator<StreamOfStudentGroup> {

    // Метод сравнения двух потоков по количеству групп
    @Override
    public int compare(StreamOfStudentGroup stream1, StreamOfStudentGroup stream2) {
        // Получаем количество групп в каждом потоке
        int size1 = stream1.getStudentGroupList().size();
        int size2 = stream2.getStudentGroupList().size();

        // Сравниваем количество групп
        if (size1 < size2) {
            return -1; // Возвращаем отрицательное число, если первый поток содержит меньше групп
        } else if (size1 > size2) {
            return 1; // Возвращаем положительное число, если первый поток содержит больше групп
        } else {
            return 0; // Возвращаем 0, если количество групп одинаково
        }
    }
}