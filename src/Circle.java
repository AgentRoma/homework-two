public class Circle extends AriaPerim {
    private double radius; // p = 2 Pi r   s = Pi r^2
    public Circle(){
    }

    public Circle(String name, int countOfAngels, int countOfSides,double radius){
        super(name, countOfAngels, countOfSides);
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override

     public String toString(){
        return  " Figure " + this.getName() + " " + "\n Has " + this.getCountOfSides() + " sides"+ "\n Length of radius is: "
                + radius + " cm" +  "\n The length of diameter: " + (radius * 2)
                + " cm" + "\n This figure has " + this.getCountOfAngels() + " angels";
    }
    @Override
    public void area(){
            double area = (Math.PI * Math.pow(radius, 2));
            System.out.println(" Aria of " + this.getName() + " equals: " + String.format("%.2f", area) + " cm^2");

    }

    @Override
    public void perimeter(){
        double perimeter = (2 * Math.PI * radius);
        System.out.println(" Perimeter of " + this.getName() + " equals: " + String.format("%.2f", perimeter) + " cm");
    }


}
