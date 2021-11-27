package Lecture_5_generics.Exchange_desk;

public class USD implements Currency{
    private static int absRate = 0;
    private int crtAmount;

    public USD(int crtAmount) {
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
        return "absolute rate: "+absRate+", crt amount: "+crtAmount+" USD";
    }
}
