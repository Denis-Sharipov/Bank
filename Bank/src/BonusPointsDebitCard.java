class BonusPointsDebitCard extends DebitCard {
    public BonusPointsDebitCard(double cashbackRate) {
        super(cashbackRate);
    }

    @Override
    public void topUp(double amount) {
        balance += amount;
        addBonusPoints(amount * 0.01);
    }
}