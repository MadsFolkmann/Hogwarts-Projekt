package src.edu.hogwarts.data;

public class Ingredient extends TeachingMaterial {
    private String name;
    private double amount;
    private String unit;

    public Ingredient(String name, double amount, String unit) {
        super(name, false, false, false, "Amount: " + amount + " " + unit);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("Name: ").append(name).append("\n");
        result.append("Amount: ").append(amount).append(" ").append(unit).append("\n");
        return result.toString();
    }
}
