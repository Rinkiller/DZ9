import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortedAttendanceView extends AttendanceView{
 
    
    public void print(List<Student> timeListofStudents){
        System.out.println("Список студентов по убыванию успеваемости");
        String[] names = new String[timeListofStudents.size()];
        Map<String, Double> perscentOfName = new HashMap<>();
        for(Student student : timeListofStudents){
            int count = 0;
            for (Map.Entry<LocalDate, Boolean> entry : student.attendance.entrySet()) {
                if(entry.getValue() == true)  count++;         
            }
            perscentOfName.put(student.name, (double)count/student.attendance.size()*100);           
       
        }
       



        Map<String, Double> perscentOfName1 = new HashMap<>();
        perscentOfName1.putAll(perscentOfName);
        
        int count = 0;
        for(Map.Entry<String, Double> entry2 : perscentOfName.entrySet()){
            String name = "";
            Double MaxValue = 0.0;    
            for(Map.Entry<String, Double> entry1 : perscentOfName1.entrySet()){
                if(MaxValue < entry1.getValue()){ MaxValue = entry1.getValue(); name = entry1.getKey();}
            }
            names[count] = name;
            count++;
            perscentOfName1.remove(name);
        }
        for (String name : names) {
            System.out.println("Студент =  " + name + " успеваемость = " + perscentOfName.get(name) + "%");
                    
        }

        System.out.println();

    }
    
}
