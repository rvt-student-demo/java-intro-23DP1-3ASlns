package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        double costAffordable = 2.50;
        if (this.balance >= costAffordable)[
            this.balance -= costAffordable;
        ]
    }
    
    public void eatHeartily() {
        double costHeart = 5;
        if (this.balance >= costHeart){
            this.balance -= costHeart;

        }
    }

    public String toString() {
        return "Card balance: " + this.balance + "€";
    }


}
