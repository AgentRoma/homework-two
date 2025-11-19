public class Triangle extends AriaPerim {
    private double sideLength;
    private double height;

    public Triangle() {
    }

    public Triangle(String name, int countOfAngels, int countOfSides, double areas, double perimeters, double sideLength, double height) {
        /* VSE */
        super(name, countOfAngels, countOfSides, areas, perimeters);
        this.sideLength = sideLength;
        this.height = height;
    }

    public double getLength() {
        return sideLength;
    }

    public void setLength(double length) {
        this.sideLength = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {

        return " Figure " + this.getName() + " " +
                "\n Has " + this.getCountOfSides() + " sides"+ "\n Length of side is: " + sideLength + " cm"
                + "\n The height of figure is: " + height + " cm" + "\n This figure has " + this.getCountOfAngels() + " angels";

    }

    @Override
    public void area() {
        System.out.println(" Aria of " + this.getName() + " equals: " + this.getAreas() + " cm^2");
    }

    @Override
    public void perimeter(){
        System.out.println(" Perimeter of " + this.getName() + " equals: " + this.getPerimeters() + " cm");
    }


}
