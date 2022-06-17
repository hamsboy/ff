
/**
 * Write a description of class College here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class College extends Student{
    public static final double CREDIT_PRICE = 110;

    public College(String id, String firstName, String lastName, int day, int month, int year, Sex sex, int credit){
        super(id, firstName, lastName, sex, day, month, year);
        setCredit(credit);
    }

    @Override
    public double getPrice() {
        return getCredit() * CREDIT_PRICE;
    }

    public boolean getFullTime(){
        if(getCredit() > 13)
            return true;
        return false;
    }
}
