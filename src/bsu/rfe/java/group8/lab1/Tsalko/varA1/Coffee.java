package bsu.rfe.java.group8.lab1.Tsalko.varA1;

public class Coffee extends Food{
    private String aroma;

    static int Count = 0;
    public Coffee(String aroma) {
        super("Кофе");
        this.aroma = aroma;
    }
    public void consume() {
        System.out.println(this + " выпит");
    }
    public String getAroma() {
        return aroma;
    }
    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String toString() {
        return super.toString() + " аромат '" + aroma.toUpperCase() + "'";
    }


}

