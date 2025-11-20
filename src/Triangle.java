public class Triangle extends AriaPerim {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(String name, int countOfAngels, int countOfSides, double a, double b, double c) {
        /* VSE */
        super(name, countOfAngels, countOfSides);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC(){
        return c;
    }

    public void setC(double c){
        this.c = c;
    }

    @Override
    public String toString() {

        return " Figure " + this.getName() + " " +
                "\n Has " + this.getCountOfSides() + " sides"+ "\n Length of side is: " + b + " cm"
                + "\n The height of figure is: " + b + " cm" + "\n This figure has " + this.getCountOfAngels() + " angels";

    }

    @Override
    public void area() {
        double p = (a + b + c) / 2;
        double aria  = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(" Aria of " + this.getName() + " equals: "+ String.format("%.2f",aria)  + " cm^2");
    }

    @Override
    public void perimeter(){
        System.out.println(" Perimeter of " + this.getName() + " equals: "+ (a + b + c) + " cm");
    }


}
