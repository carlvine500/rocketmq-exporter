import java.math.BigDecimal;

public class Test2 {

    public static void main(String[] args) {
        double d = 1.1;
        BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant; same result
        System.out.println(bd1);
        System.out.println(bd2);
    }
}
