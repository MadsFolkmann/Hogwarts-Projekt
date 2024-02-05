import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Application {
    
    public void initApp() {
        ArrayList<HogwartsStudent> hogwartsStudents = new DynamicArray<>();
        ArrayList<HogwartsTeacher> hogwartsTeachers = new DynamicArray<>();

        // Creating Hogwarts Students
        HogwartsStudent student1 = new HogwartsStudent(1991, "Harry", "James", "Potter", House.GRYFFINDOR, true, new String[]{"Quidditch"});
        HogwartsStudent student2 = new HogwartsStudent(1991, "Hermione", "Jean", "Granger", House.GRYFFINDOR, false, new String[]{"Study Group"});
        HogwartsStudent student3 = new HogwartsStudent(1991, "Ronald", "Bilius", "Weasley", House.GRYFFINDOR, false, new String[]{"Chess Club"});

        hogwartsStudents.add(student1);
        hogwartsStudents.add(student2);
        hogwartsStudents.add(student3);

        // Creating Hogwarts Teachers
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            HogwartsTeacher slughorn = new HogwartsTeacher("Horace Slughorn", "Potions Master", dateFormat.parse("1996-09-01"), House.SLYTHERIN, false);
            HogwartsTeacher snape = new HogwartsTeacher("Severus Snape", "Potions Master", dateFormat.parse("1981-09-01"), House.SLYTHERIN, true);

            hogwartsTeachers.add(slughorn);
            hogwartsTeachers.add(snape);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Creating Courses
        Course potionsCourse = new Course(new Subject("Potions", 6, true), hogwartsTeachers.get(0), new Student[]{student1, student2, student3}, new TeachingMaterial[]{});

        // Display information for Hogwarts Students
        System.out.println("Hogwarts Students:");
        for (int i = 0; i < hogwartsStudents.size(); i++) {
            HogwartsStudent student = hogwartsStudents.get(i);
            System.out.println(student);
        }

        // Display information for Hogwarts Teachers
        System.out.println("\nHogwarts Teachers:");
        for (int i = 0; i < hogwartsTeachers.size(); i++) {
            HogwartsTeacher teacher = hogwartsTeachers.get(i);
            System.out.println(teacher);
        }
        
        // Display information for Courses
        System.out.println(potionsCourse);
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.initApp();
    }
}
