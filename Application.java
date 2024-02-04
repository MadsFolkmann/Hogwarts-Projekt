
public class Application {
    
    public void initApp(){
        DynamicArray hogwartsStudents = new DynamicArray();


        HogwartsStudent student1 = new HogwartsStudent(1991, "Harry", "James", "Potter", House.GRYFFINDOR, true, new String[]{"Quidditch"});
        HogwartsStudent student2 = new HogwartsStudent(1991, "Hermione", "Jean", "Granger", House.GRYFFINDOR, false, new String[]{"Study Group"});
        HogwartsStudent student3 = new HogwartsStudent(1991, "Ronald", "Bilius", "Weasley", House.GRYFFINDOR, false, new String[]{"Chess Club"});

        hogwartsStudents.add(student1);
        hogwartsStudents.add(student2);
        hogwartsStudents.add(student3);

        for (int i = 0; i < hogwartsStudents.size(); i++) {
            HogwartsStudent student = (HogwartsStudent) hogwartsStudents.get(i);
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.initApp();
    }
}