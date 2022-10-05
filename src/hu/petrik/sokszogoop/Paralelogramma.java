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

    @Override
    public double getKerulet() {
        return 0;
    }

    @Override
    public double getTerulet() {
        return 0;
    }
}
