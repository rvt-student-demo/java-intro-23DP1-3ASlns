package lv.rvt;

public class PaymentCard {
    private double balance;

    // Constructor that initializes the balance with the opening balance
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    // Method that returns the card's balance in the specified format
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}


