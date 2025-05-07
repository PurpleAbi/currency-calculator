public class CurrencyConverterTestDrive {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
        Inputs inputs = new Inputs();
        inputs.takeInput();
        CurrencyApiClient client = new CurrencyApiClient();
        Currency myCurrency = client.search(
                inputs.getBaseCurrency(),
                inputs.getTargetCurrency(),
                inputs.getMoneyAmount());
        inputs.giveInput(myCurrency.conversionResult());
    }
}
