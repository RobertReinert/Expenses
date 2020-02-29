import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Expense {

    public static final Category [] CATEGORIES= {
            new Category(0, "Opłaty stałe"),
            new Category(1, "Jedzenie"),
            new Category(2, "Rozrywka"),
            new Category(3, "Ubrania"),
            new Category(4, "Inne")
    };





    private LocalDateTime time;
    private BigDecimal amount;
    private int category;

    public Expense(LocalDateTime time, BigDecimal amount, int category) {
        this.time = time;
        this.amount = amount;
        this.category = category;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getCategory() {
        return category;
    }
}
