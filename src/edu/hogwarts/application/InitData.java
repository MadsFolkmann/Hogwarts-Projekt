package src.edu.hogwarts.application;

import src.edu.hogwarts.data.HogwartsPerson;
import src.edu.hogwarts.data.HogwartsStudent;
import src.edu.hogwarts.data.HogwartsTeacher;
import src.edu.hogwarts.data.House;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class InitData {

    private StudentController studentController;
    private TeacherController teacherController;

    public InitData(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public List<HogwartsPerson> initStudentData() {
        List<HogwartsPerson> studentTestData = new ArrayList<>();

        // Opret teststuderende
        studentTestData.add(new HogwartsStudent("Hannah Abbott", 1980, House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Susan Bones", 1980, House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Terry Boot", 1980, House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Mandy Brocklehurst", 1980, House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Lavender Brown", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Millicent Bulstrode", 1980, House.SLYTHERIN, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Cho Chang", 1980, House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Penelope Clearwater", 1980, House.RAVENCLAW, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Michael Corner", 1980, House.RAVENCLAW, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Vincent Crabbe", 1980, House.SLYTHERIN, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Colin Creevey", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Dennis Creevey", 1980, House.GRYFFINDOR, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Roger Davies", 1980, House.RAVENCLAW, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Cedric Diggory", 1980, House.HUFFLEPUFF, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Marietta Edgecombe", 1980, House.RAVENCLAW, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Justin Finch-Fletchley", 1980, House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Seamus Finnigan", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Anthony Goldstein", 1980, House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Hermione Granger", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Angelina Johnson", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Lee Jordan", 1980, House.GRYFFINDOR, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Neville Longbottom", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Luna Lovegood", 1980, House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Ernie Macmillan", 1980, House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Draco Malfoy", 1980, House.SLYTHERIN, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Graham Montague", 1980, House.SLYTHERIN, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Theodore Nott", 1980, House.SLYTHERIN, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Ernie Prang", 1980, House.HUFFLEPUFF, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Padma Patil", 1980, House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Parvati Patil", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Harry Potter", 1980, House.GRYFFINDOR, true, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Adrian Pucey", 1980, House.SLYTHERIN, false, new String[]{}));
        studentTestData.add(new HogwartsStudent("Demelza Robins", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Zacharias Smith", 1980, House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Alicia Spinnet", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Dean Thomas", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Fred Weasley", 1980, House.GRYFFINDOR, true, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("George Weasley", 1980, House.GRYFFINDOR, true, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Ginny Weasley", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Ronald Weasley", 1980, House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        studentTestData.add(new HogwartsStudent("Blaise Zabini", 1980, House.SLYTHERIN, false, new String[]{}));


        for (HogwartsPerson student : studentTestData) {
            if (student instanceof HogwartsStudent) {
                studentController.createHogwartsStudent((HogwartsStudent) student);
            }
        }

        return studentTestData;
    }
    public List<HogwartsPerson> initTeacherData(){
        List<HogwartsPerson> teacherTestData = new ArrayList<>();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            teacherTestData.add(new HogwartsTeacher("Albus Percival Dumbledore", "Headmaster", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.GRYFFINDOR, true));
            teacherTestData.add(new HogwartsTeacher("Minerva McGonagall", "Deputy Head", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.GRYFFINDOR, true));
            teacherTestData.add(new HogwartsTeacher("Severus Snape", "Potions Master", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.SLYTHERIN, true));
            teacherTestData.add(new HogwartsTeacher("Pomona Sprout", "Herbology", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.HUFFLEPUFF, true));
            teacherTestData.add(new HogwartsTeacher("Filius Flitwick", "Charms Master", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.RAVENCLAW, true));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        for (HogwartsPerson teacher : teacherTestData) {
            if (teacher instanceof HogwartsTeacher) {
                teacherController.createHogwartsTeacher((HogwartsTeacher) teacher);
            }
        }

        return teacherTestData;
    }
}
