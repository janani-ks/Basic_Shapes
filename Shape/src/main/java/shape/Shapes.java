package shape;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Shapes {
	static PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
    public static void main(String[] args){
		double perimeter;
        double area;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        display.println("Please enter the type you want as same as Displayed : \n \t 1. Triangle \n \t 2. Rectangle \n \t 3. Circle");
        String type = scan1.nextLine();
        int n;
        switch(type){
            case "Triangle":
            display.println("Enter the Triangle Base,Side and Height :");
            double side = scan.nextDouble();
            double base = scan.nextDouble();
            double height = scan.nextDouble();
            BasicShapes t = new BasicShapes(side,base,height);
            n = 1;
            perimeter=t.perimeter(n);
            area=t.area(n);
            display.println("The perimeter of Triangle = "+perimeter);
            display.println("The area of Triangle = "+area);
            display.println("--------------------X---------------------");
            break;
            case "Rectangle":
            display.println("Enter the Rectangle Height and Width:");
            double height1 = scan.nextDouble();
            double width = scan.nextDouble();
            BasicShapes r = new BasicShapes(height1,width);
            n = 2;
            perimeter=r.perimeter(n);
            area=r.area(n);
            display.println("The perimeter of Rectangle  = "+perimeter);
            display.println("The area of Rectangle = "+area);
            display.println("--------------------X---------------------");
            break;
            case "Circle":
            display.println("Enter the Circle Radius :");
            double radius = scan.nextDouble();
            BasicShapes c = new BasicShapes(radius);
            n = 3;
            perimeter=c.perimeter(n);
            area=c.area(n);
            display.println("The perimeter of Circle = "+perimeter);
            display.println("The area of Circle = "+area);
            display.println("--------------------X---------------------");
            break;
            default:
            display.println("Please Enter the choice between the range 1 to 3");
            break;
        }
}
}

