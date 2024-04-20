abstract class BankCard {
    protected double balance;

    public BankCard() {
        this.balance = 0;
    }

    public abstract void topUp(double amount); //���������.

    public abstract boolean pay(double amount); //��������.

    public double getBalanceInfo() { //���������� � �������.
        return balance;
    }

    public abstract String getAvailableFundsInfo(); //���������� � ��������� ���������.

}

