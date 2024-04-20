class CashbackCreditCard extends CreditCard {
    private double creditLimit;
    private final double cashbackThreshold;
    private final double cashbackRate;

    public CashbackCreditCard(double creditLimit, double cashbackThreshold, double cashbackRate) {
        super();
        this.creditLimit = creditLimit;
        this.cashbackThreshold = cashbackThreshold;
        this.cashbackRate = cashbackRate;
    }

    @Override
    public boolean pay(double amount) {
        boolean paid = super.pay(amount);
        if (paid && amount >= super.cashbackThreshold) {
            double cashback = amount * cashbackRate;
            addBonusPoints(cashback);
        }
        return paid;
    }
}