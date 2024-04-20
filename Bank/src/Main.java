// Создание экземпляров классов и проверка работы
public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        debitCard.topUp(5000);
        System.out.println(debitCard.getAvailableFundsInfo());
        debitCard.pay(3000);
        System.out.println(debitCard.getBalance());

        CreditCard creditCard = new CreditCard(10000);
        creditCard.topUp(5000);
        System.out.println(creditCard.getAvailableFundsInfo());
        creditCard.pay(5000);
        System.out.println(creditCard.getAvailableFundsInfo());
        creditCard.topUp(2000);
        System.out.println(creditCard.getAvailableFundsInfo());
    }
}