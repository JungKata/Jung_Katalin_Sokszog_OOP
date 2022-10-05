package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog {

    private double b;
    private double alpha;

    public Paralelogramma(double a, double b, double alpha) {
        super(a);
        this.b = b;
        this.alpha = alpha;
    }

    public double getB() {
        return b;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    private double getRadian(){
        return  alpha * Math.PI / 180;  //wikipedia alapjan
    }

    @Override
    public double getKerulet() {
        return 2 * (this.getA() + this.getB()); //kerülete : 2(a + b)
    }

    @Override
    public double getTerulet() {
        return Math.abs(Math.sin(getRadian()));
    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a = %-10.3f  b = %-10.3f alpha =-10.3%f, %s", this.getA(), this.getB(), this.getAlpha(), super.toString());
    }
}
