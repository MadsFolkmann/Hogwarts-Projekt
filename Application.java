import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public void initApp() {

        InitData initData = new InitData();
        List<HogwartsPerson> testData = initData.initData();

        // Creating Courses
        Course potionsCourse = new Course(new Subject("Potions", 6, true), new Student[]{}, new TeachingMaterial[]{});

         try {
            Wand wand = new Wand(10.5, "Oak", "Phoenix Feather");
            Textbook textbook = new Textbook("Advanced Potion-Making", "Libatius Borage", "Borgin and Burkes", 1999);
            Tool cauldron = new Tool("Cauldron", "Standard size for potions");
            Ingredient fluxweed = new Ingredient("Fluxweed", 2.0, "ounces");

            potionsCourse.addTeachingMaterial(wand);
            potionsCourse.addTeachingMaterial(textbook);
            potionsCourse.addTeachingMaterial(cauldron);
            potionsCourse.addTeachingMaterial(fluxweed);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Display information for Hogwarts Students
        System.out.println("Hogwarts people:");
        for (HogwartsPerson person : testData) {
            System.out.println(person);
        }

        // Display information for Courses
        System.out.println(potionsCourse);
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.initApp();
    }
}
