package src.edu.hogwarts.application;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import src.edu.hogwarts.data.HogwartsPerson;
import src.edu.hogwarts.data.HogwartsStudent;
import src.edu.hogwarts.data.HogwartsTeacher;

public class UserInterface {
    private StudentController studentController;
    private TeacherController teacherController;

    public UserInterface(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public void displayStudentsAndTeachers() {
        System.out.println("Students:");
        System.out.println("---------------------------------");
        System.out.println("Name                | House");
        System.out.println("---------------------------------");
        for (HogwartsStudent student : studentController.getAllHogwartsStudent()) {
            System.out.printf("%-20s | %s\n", student.getFullName(), student.getHouse());
        }
        System.out.println("---------------------------------");

        System.out.println("\nTeachers:");
        System.out.println("---------------------------------");
        System.out.println("Name                    | House");
        System.out.println("---------------------------------");
        for (HogwartsTeacher teacher : teacherController.getAllHogwartsTeachers()) {
            System.out.printf("%-25s | %s\n", teacher.getFullName(), teacher.getHouse());
        }
        System.out.println("---------------------------------");
    }
    public void displayStudentsAndTeachers(List<HogwartsStudent> sortedStudents, List<HogwartsTeacher> sortedTeachers) {
        System.out.println("Students:");
        System.out.println("---------------------------------");
        System.out.println("Name                | House");
        System.out.println("---------------------------------");
        for (HogwartsStudent student : sortedStudents) {
            System.out.printf("%-20s | %s\n", student.getFullName(), student.getHouse());
        }
        System.out.println("---------------------------------");

        System.out.println("\nTeachers:");
        System.out.println("---------------------------------");
        System.out.println("Name                    | House");
        System.out.println("---------------------------------");
        for (HogwartsTeacher teacher : sortedTeachers) {
            System.out.printf("%-25s | %s\n", teacher.getFullName(), teacher.getHouse());
        }
        System.out.println("---------------------------------");
    }


    public void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("f: Filter");
        System.out.println("s: Sort");
        System.out.println("q: Quit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option: ");
            String option = scanner.nextLine().toLowerCase();

            switch (option) {
                case "f":
                    filterData();
                    break;
                case "s":
                    sortData();
                    break;
                case "q":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }

    private void filterData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Filter options:");
        System.out.println("h: Filter by House");

        System.out.print("Choose an option: ");
        String filterOption = scanner.nextLine().toLowerCase();

        switch (filterOption) {
            case "h":
                System.out.print("Enter house to filter (e.g., Gryffindor): ");
                String houseName = scanner.nextLine();
                filterByHouse(houseName);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }

        scanner.close();
    }

    private void sortData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort options:");
        System.out.println("n: Sort by Name");
        System.out.println("h: Sort by House");
        System.out.print("Choose an option: ");
        String sortOption = scanner.nextLine().toLowerCase();

        Comparator<HogwartsPerson> comparator = null;

        switch (sortOption) {
            case "n":
                comparator = Comparator.comparing(HogwartsPerson::getFullName);
                break;
            case "h":
                comparator = Comparator.comparing((person) -> person.getHouse().getName());
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                return;
        }

        // Sort students and teachers
        List<HogwartsStudent> sortedStudents = studentController.sortStudents(comparator);
        List<HogwartsTeacher> sortedTeachers = teacherController.sortTeachers(comparator);

        // Display sorted data for both students and teachers
        displayStudentsAndTeachers(sortedStudents, sortedTeachers);

    }

    public void filterByHouse(String houseName){
        System.out.println("Filtered by House: " + houseName);
        System.out.println("---------------------------------");
        System.out.println("Name                | House");
        System.out.println("---------------------------------");
        for (HogwartsStudent student : studentController.getAllHogwartsStudent()) {
            if (student.getHouse().getName().equalsIgnoreCase(houseName)) {
                System.out.printf("%-20s | %s\n", student.getFullName(), student.getHouse());
            }
        }
        for (HogwartsTeacher teacher : teacherController.getAllHogwartsTeachers()) {
            if (teacher.getHouse().getName().equalsIgnoreCase(houseName)) {
                System.out.printf("%-25s | %s\n", teacher.getFullName(), teacher.getHouse());
            }
        }
        System.out.println("---------------------------------");
    }
}
