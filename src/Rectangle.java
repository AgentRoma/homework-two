public class Rectangle extends AriaPerim{
    private double sideLength;
    private double width;


    public Rectangle(){
    }

    public Rectangle(String name, int countOfAngels, int countOfSides, double sideLength,  double width){
        super(name, countOfAngels, countOfSides);
        this.sideLength = sideLength;
        this.width = width;

    }

    public double getSideLength(){
        return sideLength;
    }

    public void setSideLength(double sideLength){
        this.sideLength = sideLength;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
@Override
    public String toString(){
     return " Figure " + this.getName() + " " + "\n Has " + this.getCountOfSides() + " sides"+ "\n Length of side is: "
            + sideLength + " cm" + "\n Width is: "+ width + " cm"+  "\n The height of figure is: " + sideLength
                + " cm" + "\n This figure has " + this.getCountOfAngels() + " angels";

    }

    @Override

    public void area() {
        System.out.println(" Aria of " + this.getName() + " equals: " + sideLength * width + " cm^2");
    }

    @Override
    public void perimeter(){
        System.out.println(" Perimeter of " + this.getName() + " equals: " + (sideLength + width) * 2  + " cm");
    }


}
