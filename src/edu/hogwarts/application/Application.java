package src.edu.hogwarts.application;

import src.edu.generic.Student;
import src.edu.hogwarts.data.*;

import java.util.List;


public class Application {
    private UserInterface userInterface;
    private StudentController studentController;
    private TeacherController teacherController;

    public void initApp() {
        studentController = new StudentController();
        teacherController = new TeacherController();

        InitData initData = new InitData(studentController, teacherController);
        initData.initStudentData();
        initData.initTeacherData();

        userInterface = new UserInterface(studentController, teacherController);
        userInterface.displayStudentsAndTeachers();
        userInterface.run();
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.initApp();
    }
}
