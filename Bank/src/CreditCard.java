class CreditCard extends BankCard {
    private double creditLimit;
    private double creditBalance;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
        this.creditBalance = creditLimit;
    }

    @Override
    public void topUp(double amount) {
        if (amount + creditBalance >= creditLimit) {
            balance = amount + creditBalance - creditLimit;
            creditBalance = creditLimit;
        }
    }

    @Override
    public boolean pay(double amount) {

        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            double remainingAmount = amount - balance;
            if (remainingAmount <= creditLimit) {
                balance = 0;
                creditLimit -= remainingAmount;
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Кредитный лимит: " + creditLimit + "\nБаланс: " + balance;
    }
}