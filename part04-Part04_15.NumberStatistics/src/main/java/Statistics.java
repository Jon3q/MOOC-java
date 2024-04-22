
public class Statistics {
    private int num;
    private int sum;
    public Statistics(){
        this.sum = 0;
    }
    public void addNumber(int number){
        if (number != -1) {
            this.num = this.num + number;
            this.sum++;
        }
    }
    public int getCount(){
        return sum;
    }
    public int sum(){
        return num;
    }
    public double average(){
        if (sum > 0) {
            return (double) num / sum;
        } else {
            return 0.0;
        }
    }
}
