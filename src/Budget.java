public class Budget {
    private double income;
    private double expenses;
    private double remainingBudget;

    // constructor that takes in income and expenses as parameters
    public Budget(double income, double expenses) {
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative");
        }
        if (expenses < 0) {
            throw new IllegalArgumentException("Expenses cannot be negative");
        }
        this.income = income;
        this.expenses = expenses;
        this.remainingBudget = income - expenses;
    }

    // Getter method for income
    public double getIncome() {
        return income;
    }

    // Setter method for income
    public void setIncome(double income) {
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative");
        }
        this.income = income;
    }

    // Getter method for expenses
    public double getExpenses() {
        return expenses;
    }

    // Setter method for expenses
    public void setExpenses(double expenses) {
        if (expenses < 0) {
            throw new IllegalArgumentException("Expenses cannot be negative");
        }
        this.expenses = expenses;
    }

    // Getter method for remaining budget
    public double getRemainingBudget() {
        return remainingBudget;
    }

    // Method to update the remaining budget by subtracting expenses from income
    public void updateRemainingBudget() {
        this.remainingBudget = this.income - this.expenses;
    }
}
