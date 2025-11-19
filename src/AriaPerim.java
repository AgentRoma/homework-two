public abstract class AriaPerim {
    private String name;
    private int countOfAngels;
    private int countOfSides;
    private double areas;
    private double perimeters;

    public AriaPerim() {
    }

    public AriaPerim(String name, int countOfAngels, int countOfSides, double areas, double perimeters) {
        this.name = name;
        this.countOfAngels = countOfAngels;
        this.countOfSides = countOfSides;
        this.areas = areas;
        this.perimeters = perimeters;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfAngels() {
        return this.countOfAngels;
    }

    public void setCountOfAngels(int countOfAngels) {
        this.countOfAngels = countOfAngels;
    }

    public int getCountOfSides() {
        return this.countOfSides;
    }

    public void setCountOfSides(int countOfSides) {
        this.countOfSides = countOfSides;
    }

    public double getAreas() {
        return this.areas;
    }

    public void setAreas(double areas) {
        this.areas = areas;
    }

    public double getPerimeters() {
        return this.perimeters;
    }

    public void setPerimeters(double perimeters) {
        this.perimeters = perimeters;
    }


    @Override
    public String toString() {
        return "Figure " + name + " figure count of angels is: " + countOfAngels + " and has " + countOfSides + " sides";
    }

    public void area() {
        System.out.println("Aria of " + name + " equals: " + areas);
    }

    public void perimeter() {
        System.out.println("Perimeter of " + name + " equals: " + perimeters);
    }

}
