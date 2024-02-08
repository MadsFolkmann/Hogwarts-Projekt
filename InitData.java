import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InitData {

    public List<HogwartsPerson> initData() {
        List<HogwartsPerson> testData = new ArrayList<>();

        // Opret teststuderende
        testData.add(new HogwartsStudent(1980, "Hannah", "", "Abbott", House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Susan", "", "Bones", House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Terry", "", "Boot", House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Mandy", "", "Brocklehurst", House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Lavender", "", "Brown", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Millicent", "", "Bulstrode", House.SLYTHERIN, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Cho", "", "Chang", House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Penelope", "", "Clearwater", House.RAVENCLAW, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Michael", "", "Corner", House.RAVENCLAW, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Vincent", "", "Crabbe", House.SLYTHERIN, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Colin", "", "Creevey", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Dennis", "", "Creevey", House.GRYFFINDOR, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Roger", "", "Davies", House.RAVENCLAW, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Cedric", "", "Diggory", House.HUFFLEPUFF, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Marietta", "", "Edgecombe", House.RAVENCLAW, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Justin", "", "Finch-Fletchley", House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Seamus", "", "Finnigan", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Anthony", "", "Goldstein", House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Hermione", "Jean", "Granger", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Angelina", "", "Johnson", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Lee", "", "Jordan", House.GRYFFINDOR, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Neville", "", "Longbottom", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Luna", "", "Lovegood", House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Ernie", "", "Macmillan", House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Draco", "", "Malfoy", House.SLYTHERIN, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Graham", "", "Montague", House.SLYTHERIN, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Theodore", "", "Nott", House.SLYTHERIN, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Ernie", "", "Prang", House.HUFFLEPUFF, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Padma", "", "Patil", House.RAVENCLAW, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Parvati", "", "Patil", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Harry", "James", "Potter", House.GRYFFINDOR, true, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Adrian", "", "Pucey", House.SLYTHERIN, false, new String[]{}));
        testData.add(new HogwartsStudent(1980, "Demelza", "", "Robins", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Zacharias", "", "Smith", House.HUFFLEPUFF, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Alicia", "", "Spinnet", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Dean", "", "Thomas", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Fred", "", "Weasley", House.GRYFFINDOR, true, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "George", "", "Weasley", House.GRYFFINDOR, true, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Ginny", "", "Weasley", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Ronald", "Bilius", "Weasley", House.GRYFFINDOR, false, new String[]{"Dumbledore's Army"}));
        testData.add(new HogwartsStudent(1980, "Blaise", "", "Zabini", House.SLYTHERIN, false, new String[]{}));

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            testData.add(new HogwartsTeacher("Albus Percival Dumbledore", "Headmaster", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.GRYFFINDOR, true));
            testData.add(new HogwartsTeacher("Minerva McGonagall", "Deputy Head", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.GRYFFINDOR, true));
            testData.add(new HogwartsTeacher("Severus Snape", "Potions Master", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.SLYTHERIN, true));
            testData.add(new HogwartsTeacher("Pomona Sprout", "Herbology", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.HUFFLEPUFF, true));
            testData.add(new HogwartsTeacher("Filius Flitwick", "Charms Master", dateFormat.parse("1956-01-01"), dateFormat.parse("2025-12-31"), House.RAVENCLAW, true));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return testData;
    }
}
