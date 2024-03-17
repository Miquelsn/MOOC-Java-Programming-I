public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance=openingBalance;
    }

    public String toString() {
        // write code here
        return "The card has a balance of "+this.balance+" euros";
    }
    public void eatAffordably() {
        // write code here

        if(balance<2.6){
            return;
        }
        this.balance-=2.6;
    }
    
    public void eatHeartily() {
        // write code here
        if(balance<4.6){
            return;
        }
        this.balance-=4.6;
    }
    public void addMoney(double amount) {
        // write code here
        if(amount<0){
            return;
        }
        this.balance+=amount;
        if(this.balance>150){
            this.balance=150;
        }
    }
}