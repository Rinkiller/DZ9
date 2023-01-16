public class Presenter {
    AttendanceView view;
    AttendanceService model;
    
    public Presenter(AttendanceView view, AttendanceService model) {
        this.view = view;
        this.model = model;
    }

    public void run(){
        view.print(model.getTimeListofStudents());

    }
}
