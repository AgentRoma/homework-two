public class Square extends AriaPerim {
    private double a;



    public Square() {
    }

    public Square(String name, int countOfAngels, int countOfSides, double a){
        super(name, countOfAngels, countOfSides);
        this.a = a;



    }

    public double getA() {
        return a;
    }



    public void setA(double a) {
        this.a = a;
    }



    @Override
    public String toString (){
        return " Figure " + this.getName() + " " + "\n Has " + this.getCountOfSides() + " sides"+ "\n Length of side is: "
                + a + " cm" +  "\n The height of figure is: " + a
                + " cm" + "\n This figure has " + this.getCountOfAngels() + " angels";

    }

    @Override

    public void area() {

        System.out.println(" Aria of " + this.getName() + " equals: " + (a * a) + " cm^2");
    }

    @Override
    public void perimeter(){
        System.out.println(" Perimeter of " + this.getName() + " equals: " + (a * 4) + " cm");
    }

}
