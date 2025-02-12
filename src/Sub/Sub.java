package Sub;

import Super.Super;

public class Sub extends Super {
    private int tens = 1 * 10;

    public Sub(int t){
        super(2, 6 ,4);
        super.Total();
        this.tens = t * 10;
    }

    @Override
    public double Total(){
        return ones + cents + hundreds + tens;
    }
}
