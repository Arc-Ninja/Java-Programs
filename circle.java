import java.util.Scanner;
import java.lang.Math;
class radius{
    double r;
    radius(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the radius of the circle: ");
        r = scan.nextDouble();
        System.out.printf("\nThe area of the given circle is = %.3f", (r*r*Math.PI));
    }
}
public class circle{
    public static void main(String[] args){
        radius circle = new radius();
    }
}