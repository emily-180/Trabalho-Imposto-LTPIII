public abstract class  Tax {
    protected double number;
    protected String name;
    protected Tax(double number, String name) {
        this.number = number;
        this.name = name;
    }
    public String getName() {
    	return name;
    }

    public double getNumber() {
        return number;
    }
}
