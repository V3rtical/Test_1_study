package Sub;

import Super.Super;

public class Sub extends Super {
    public int tens = 1 * 10;

    public Sub(int t){
        super(2, 6 ,4);
        this.tens = t * 10;
    }

    @Override
    public double Total(){
        return ones + cents + hundreds + tens;
    }
}
