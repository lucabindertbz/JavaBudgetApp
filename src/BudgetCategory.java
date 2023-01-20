public class BudgetCategory {
    private String categoryName;
    private double budgetedAmount;
    private double spentAmount;

    // constructor that takes in category name and budgeted amount as parameters
    public BudgetCategory(String categoryName, double budgetedAmount) {
        // Check if category name is null or empty
        if (categoryName == null || categoryName.isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be null or empty");
        }
        // Check if budgeted amount is negative
        if (budgetedAmount < 0) {
            throw new IllegalArgumentException("Budgeted amount cannot be negative");
        }
        this.categoryName = categoryName;
        this.budgetedAmount = budgetedAmount;
        this.spentAmount = 0.0;
    }

    // Getter method for category name
    public String getCategoryName() {
        return categoryName;
    }

    // Setter method for category name
    public void setCategoryName(String categoryName) {
        // Check if category name is null or empty
        if (categoryName == null || categoryName.isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be null or empty");
        }
        this.categoryName = categoryName;
    }

    // Getter method for budgeted amount
    public double getBudgetedAmount() {
        return budgetedAmount;
    }

    // Setter method for budgeted amount
    public void setBudgetedAmount(double budgetedAmount) {
        // Check if budgeted amount is negative
        if (budgetedAmount < 0) {
            throw new IllegalArgumentException("Budgeted amount cannot be negative");
        }
        this.budgetedAmount = budgetedAmount;
    }

    // Getter method for spent amount
    public double getSpentAmount() {
        return spentAmount;
    }

    // Setter method for spent amount
    public void setSpentAmount(double spentAmount) {
        // Check if spent amount is negative
        if (spentAmount < 0) {
            throw new IllegalArgumentException("Spent amount cannot be negative");
        }
        this.spentAmount = spentAmount;
    }
}
