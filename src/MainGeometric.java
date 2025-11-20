import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MainGeometric {
    static void main() {
        Scanner scan = new Scanner(System.in);
        List<AriaPerim> areaPerim = new ArrayList<>();
         areaPerim.add(new Triangle("Triangle",3 ,3,3,3,3));
         areaPerim.add(new Square("Square",4,4,4));
         areaPerim.add(new Rectangle("Rectangle", 4,4,130,46));




        boolean yes = true;
        while(yes) {
            System.out.println("Choose figure: \n1.Triangle \n2.Square \n3.Rectangle \n4.Circle");
            int answer = scan.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Enter the side1 length: ");
                    int side1 = scan.nextInt();
                    System.out.println("Enter the side2 length: ");
                    int side2 = scan.nextInt();
                    System.out.println("Enter the side3 length: ");
                    int side3 = scan.nextInt();

                    Triangle triangle = new Triangle("Triangle", 3, 3, side1, side2, side3);
                    triangle.area();
                    triangle.perimeter();
                break;
                case 2:
                    System.out.println("Enter the side1 length: ");
                    int side4 = scan.nextInt();
                    Square square = new Square("Square", 4, 4, side4);
                    square.area();
                    square.perimeter();
                    break;

                case 3:
                    System.out.println("Enter the side1 length: ");
                    int side5 = scan.nextInt();
                    System.out.println("Enter the side2 length: ");
                    int side6 = scan.nextInt();

                    Triangle triangle1 = new Triangle("Triangle", 3, 3, side5, side6, side6);
                    triangle1.area();
                    triangle1.perimeter();
                    break;

                case 4:
                    System.out.println("Enter radius");
                    int radius = scan.nextInt();

                    Circle circle = new Circle("Circle", 0, 0,radius);
                    circle.area();
                    circle.perimeter();
                    break;
            }
            System.out.println("another one ? yes or no ");
            String i = scan.next();
            if("yes".equals(i)) {
                yes = true;
            }else{
                yes = false;
            }
        }


    }

}
