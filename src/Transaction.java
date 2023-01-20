import java.util.Date;

public class Transaction {
    private double amount;
    private String category;
    private Date date;

    // constructor that takes in amount, category and date as parameters
    public Transaction(double amount, String category, Date date) {
        // Check if amount is negative
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        // Check if category is null or empty
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty");
        }
        // Check if date is null
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Getter method for amount
    public double getAmount() {
        return amount;
    }

    // Setter method for amount
    public void setAmount(double amount) {
        // Check if amount is negative
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.amount = amount;
    }

    // Getter method for category
    public String getCategory() {
        return category;
    }

    // Setter method for category
    public void setCategory(String category) {
        // Check if category is null or empty
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty");
        }
        this.category = category;
    }

    // Getter method for date
    public Date getDate() {
        return date;
    }

    // Setter method for date
    public void setDate(Date date) {
        // Check if date is null
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        this.date = date;
    }
}
