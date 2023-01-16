import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;


    public class main{
        public static void main(String[] args) {
            AttendanceService serv = new AttendanceService( Arrays.asList(
                new Student("Max",Map.of(LocalDate.of(2020, 1, 8) , false, LocalDate.of(2020, 2, 8) , true, LocalDate.of(2020, 2, 18) , false, LocalDate.of(2020, 4, 28) , false, LocalDate.of(2020, 11, 11) , false)) ,
                new Student("Andrey",Map.of(LocalDate.of(2020, 1, 8) , false, LocalDate.of(2020, 1, 10) , true, LocalDate.of(2020, 2, 18) , false, LocalDate.of(2020, 4, 28) , false, LocalDate.of(2020, 11, 11) , true)),
                new Student("Alex",Map.of(LocalDate.of(2020, 1, 8) , false, LocalDate.of(2020, 1, 10) , true, LocalDate.of(2020, 2, 18) , false, LocalDate.of(2020, 4, 28) , true, LocalDate.of(2020, 11, 11) , true))
                )
            ); 
        AllStudendtsAttendanceView view1 = new AllStudendtsAttendanceView();

        Lov25StudentsAttendanceView view2 = new Lov25StudentsAttendanceView();

        SortedAttendanceView view3 = new SortedAttendanceView();
        Presenter presenter1 = new Presenter(view1, serv);
        presenter1.run();
        Presenter presenter2 = new Presenter(view2, serv);
        presenter2.run();
        Presenter presenter3 = new Presenter(view3, serv);
        presenter3.run();        
        }
    }