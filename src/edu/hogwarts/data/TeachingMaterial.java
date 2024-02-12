package src.edu.hogwarts.data;

public abstract class TeachingMaterial {
    private String name;
    private boolean onShoppingList;
    private boolean required;
    private boolean provided;
    private String notes;

    public TeachingMaterial(String name, boolean onShoppingList, boolean required, boolean provided, String notes) {
        this.name = name;
        this.onShoppingList = onShoppingList;
        this.required = required;
        this.provided = provided;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public boolean isOnShoppingList() {
        return onShoppingList;
    }

    public boolean isRequired() {
        return required;
    }

    public boolean isProvided() {
        return provided;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "src.data.TeachingMaterial: " +
                "name='" + name + '\'' +
                ", onShoppingList=" + onShoppingList +
                ", required=" + required +
                ", provided=" + provided +
                ", notes='" + notes + '\'';
    }
}
