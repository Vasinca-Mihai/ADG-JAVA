package Lecture_5_generics.Pairs;

public abstract class AbstractShoe implements Shoe{
    private int size;
    private String color;

    public AbstractShoe(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }
}
