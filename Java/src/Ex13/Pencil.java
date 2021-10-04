package Ex13;

public class Pencil {
    String color1, color2;
    int size;

    public Pencil(String color1, String color2, int size) {
        this.color1 = color1;
        this.color2 = color2;
        this.size = size;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSameColor(Pencil other) {
        return this.color1.equals(other.color1) && this.color2.equals(other.color2);
    }
}
