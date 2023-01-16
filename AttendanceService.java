// Есть группа студентов. Для каждого студента есть журнал его посещаемости: список дат занятий и для каждой даты — посетил студент занятие или нет. 
//Создайте класс AttendanceService (сервис посещаемости), в котором хранится информация обо всех студентах.
import java.util.ArrayList;
import java.util.List;


public class AttendanceService {
    private List<Student> timeListofStudents = new ArrayList<>();

    public AttendanceService(List<Student> timeList) {
        this.timeListofStudents = timeList;
    }

    public List<Student> getTimeListofStudents() {
        return timeListofStudents;
    }
    
    
}
