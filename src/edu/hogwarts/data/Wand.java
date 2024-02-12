package src.edu.hogwarts.data;

public class Wand extends TeachingMaterial {
    private double lengthInInches;
    private String wood;
    private String core;

    public Wand(double lengthInInches, String wood, String core) {
        super("src.data.Wand", false, false, false, "Length: " + lengthInInches + " inches, Wood: " + wood + ", Core: " + core);
    }

    public double getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(double lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("Length in Inches: ").append(lengthInInches).append("\n");
        result.append("Wood: ").append(wood).append("\n");
        result.append("Core: ").append(core).append("\n");
        return result.toString();
    }
}
