package lesson_6;

public class Less6 {
    private int i;
    private String s = "";
    private double b;

    @Override
    public String toString() {
        return "Less6{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", b=" + b +
                '}';
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {

        if (b > 0 && b < 100)
            this.b = b;
        else
            System.out.println("put correct number from 0 to 100!");
    }
}
