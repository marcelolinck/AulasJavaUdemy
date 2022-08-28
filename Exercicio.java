import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {
        String product1= "Computer";
        String product2= "Office Desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price = 2100;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f %n%s, which price is $ %.2f %nRecords %d years old, code %d and gender: %s %nMeasue with decimal places: %f%n", product1, price, product2, price2, age, code, gender, measure);
        System.out.printf("Rouded(three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);
    }
}
