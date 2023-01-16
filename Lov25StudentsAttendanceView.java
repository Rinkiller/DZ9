import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Lov25StudentsAttendanceView extends AttendanceView{
    public void print(List<Student> timeListofStudents){
        System.out.println("Список студентов имеющих низкую успеваемость(менее 25%)");
        for(Student student : timeListofStudents){
            int count = 0;
            for (Map.Entry<LocalDate, Boolean> entry : student.attendance.entrySet()) {
                //System.out.println("ID =  " + entry.getKey() + " День недели = " + entry.getValue());
                if(entry.getValue() == true)  count++;         
            }
            if((double)count/student.attendance.size() <= 0.25){
                System.out.print("Студент " + student.name + " имеет посещаемость ");
                System.out.println((double)count/student.attendance.size()*100 + "%");
            }
        }
        System.out.println();
    }
}