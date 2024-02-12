package src.edu.hogwarts.data;

import java.util.Arrays;

public class House {
    public static final House GRYFFINDOR = new House("Gryffindor", "Godric Gryffindor", new String[]{"Red", "Gold"});
    public static final House HUFFLEPUFF = new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"});
    public static final House RAVENCLAW = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blue", "Silver"});
    public static final House SLYTHERIN = new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"});

    private String name;
    private String founder;
    private String[] colors;

    public House(String name, String founder, String[] colors) {
        this.name = name;
        this.founder = founder;
        this.colors = colors;
    }

    public House(String name, String founder) {
        this(name, founder, new String[0]);
    }

    public String getName() {
        return name;
    }

    public String getFounder() {
        return founder;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("House: ").append(name).append("\n");
        result.append("Founder: ").append(founder).append("\n");
        result.append("Colors: ").append(Arrays.toString(colors)).append("\n");
        return result.toString();
    }
}
