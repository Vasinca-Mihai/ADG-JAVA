package Lecture_5_generics.Exchange_desk;

public class RON implements Currency{
    private static int absRate = 0;
    private int crtAmount;

    public RON(int crtAmount) {
        this.crtAmount = crtAmount;
    }

    public int getAbsRate() {
        return absRate;
    }

    public int getCrtAmount() {
        return crtAmount;
    }

    public void setCrtAmount(int crtAmount) {
        this.crtAmount = crtAmount;
    }

    public static void setAbsRate(int absrate) {
        absRate = absrate;
    }

    public String toString(){
        return "absolute rate: "+absRate+", crt amount: "+crtAmount+" RON";
    }
}
