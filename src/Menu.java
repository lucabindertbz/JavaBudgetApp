import java.util.Scanner;
import java.time.LocalDate;

public class Menu {
    private Budget budget;

    public Menu() {
        this.budget = new Budget();
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Set Budgeted Amount");
            System.out.println("2. Add Budget Category");
            System.out.println("3. Add Transaction");
            System.out.println("4. View Budget");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    setBudgetedAmount();
                    break;
                case 2:
                    addBudgetCategory();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    viewBudget();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scan.close();
    }

    private void setBudgetedAmount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter budgeted amount: ");
        double amount = scan.nextDouble();
        budget.setBudgetedAmount(amount);
        System.out.println("Budgeted amount set to $" + amount);
    }

    private void addBudgetCategory() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter category name: ");
        String name = scan.nextLine();
        System.out.print("Enter budgeted amount for this category: ");
        double amount = scan.nextDouble();
        budget.addBudgetCategory(new BudgetCategory(name, amount));
        System.out.println("Budget category '" + name + "' with $" + amount);
    }
}