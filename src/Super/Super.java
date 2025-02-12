package Super;



public class Super {
    protected int ones;
    protected double cents;
    protected int hundreds;

    public Super(int o, double c, int h){
        this.ones = o;
        this.cents = c/100;
        this.hundreds = h*100;
    }

    public void set_ones(int o){
        if (o > 0){
            ones = o;
        }else {
            System.out.println("No 'Ones' have been entered");
        }

    }
    public void set_cents(double c){
        cents = c/100;
    }
    public void set_cents(double c, double quarters){
        cents = c/100;
        //converts to how man quarters,
        cents /= quarters;
    }
    public void set_hundreds(int h){
        hundreds = h*100;
    }
    public int get_ones(){
        return ones;
    }
    public double get_cents(){
        return cents;
    }
    public int get_hundreds(){
        return hundreds;
    }
    public double Total(){
        return ones + cents + hundreds;
    }


}
