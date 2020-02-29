import java.time.LocalDateTime;
import java.util.Scanner;

public class Expenses {
    public static void main(String[] args) {
        System.out.println("Hello Money Money Spender! \nPlease write down below the amount & the category of expense");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount: ");
        Expense expense = new Expense(LocalDateTime.now(), scanner.nextBigDecimal(), scanner.nextInt());
        System.out.println(expense);



    }
}
