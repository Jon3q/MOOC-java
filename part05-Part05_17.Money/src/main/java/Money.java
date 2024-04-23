
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    public Money plus(Money addition){
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        if (totalCents > 99) {
            totalEuros += totalCents / 100;
            totalCents %= 100;
        }

        return new Money(totalEuros, totalCents);

    }
    public boolean lessThan(Money compared){
        if(compared.euros > euros || compared.euros == euros && compared.cents > cents){
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser){
        int totalEuros = this.euros - decreaser.euros;
        int totalCents = this.cents - decreaser.cents;

        if (totalCents < 0){
            totalEuros--;
            totalCents += 100;
        }
        if (totalEuros < 0) {
            totalEuros = 0;
            totalCents = 0;
        }


        return new Money(totalEuros, totalCents);
    }
    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
