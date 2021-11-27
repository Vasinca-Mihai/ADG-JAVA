package Lecture_5_generics.Exchange_desk;


public interface Currency {
    public int getAbsRate();
    public int getCrtAmount();
    public void setCrtAmount(int crtAmount);
    public static void setAbsRate(int absRate){};
}
