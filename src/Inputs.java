import java.util.Locale;
import java.util.Scanner;

public class Inputs {
    private Scanner input = new Scanner(System.in);
    private String baseCurrency;
    private String targetCurrency;
    private double moneyAmount;

    public void takeInput() {
        System.out.println("Escriba la cantidad de dinero que desea convertir. Por ejemplo: 2500.50 \n " +
                "*** Por favor no use comas ',' *** 👇");
        moneyAmount = input.nextDouble();
        System.out.println("Escriba el codigo de la moneda base que desea convertir. Ejemplo : CZK ");
        baseCurrency = input.next();
        System.out.println("Escriba el codigo de la moneda a la que desea convertir su moneda base. " +
                "Ejemplo : MXN ");
        targetCurrency = input.next();
    }

    public void giveInput( double conversionResult ) {
        System.out.println("La cantidad de " + moneyAmount + " " + baseCurrency.toUpperCase() +
                " es igual a " + conversionResult + " " + targetCurrency.toUpperCase() + ".");
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }
}
