public class Tool extends TeachingMaterial {
    private String name;
    private String description;

    public Tool(String name, String description) {
        super(name, false, false, false, description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("Name: ").append(name).append("\n");
        result.append("Description: ").append(description).append("\n");
        return result.toString();
    }
}
