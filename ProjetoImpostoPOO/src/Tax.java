public abstract class  Tax {
    protected double number;

    protected Tax(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}
