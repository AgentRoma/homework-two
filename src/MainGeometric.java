import java.util.ArrayList;
import java.util.List;

public class MainGeometric {
    static void main() {
        List<AriaPerim> areaPerim = new ArrayList<>();
         areaPerim.add(new Triangle("Triangle",3 ,3,10.83,15,5,4.33));
         areaPerim.add(new Square("Square", 4,4,225,60,15,15));
         areaPerim.add(new Rectangle("Rectangle", 4,4,130,46, 13,10,10));
        for (AriaPerim t : areaPerim) {
            System.out.print(t + "\n");
            t.area();
            t.perimeter();
            System.out.println("================================================================");
        }
    }
}
