
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum >= 0) {
            card.addMoney(sum);
            money += sum;
        }
    }
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() >= 2.5){
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        }
        return false;
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() >= 4.3){
            card.takeMoney(4.3);
            heartyMeals++;
            return true;
        }
        return false;
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }
    public PaymentTerminal() {
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.5) {
            payment = payment - 2.5;
            money = money + 2.5;
            affordableMeals++;
            return payment;
        }
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.3) {
            payment = payment - 4.3;
            money = money + 4.3;
            heartyMeals++;
            return payment;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
