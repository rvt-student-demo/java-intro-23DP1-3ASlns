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

public void eatAffordably() {
    // write code here
    double eatAffordably = 2.60;
    if (this.balance >= eatAffordably){
        this.balance -= eatAffordably;
    }
}

public void eatHeartily() {
    // write code here
    double eatHeartily = 4.60;
    if (this.balance >= eatHeartily){
        this.balance -= eatHeartily;
    }
}

public double getBalance(){
    return this.balance;
}

public void addMoney(double amount) {
    if (amount > 0) {
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}