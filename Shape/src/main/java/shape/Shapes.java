package shape;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
class Basicshapes{
	double side;
    double base;
    double height;
    double length;
    double width;
    double radius;
    Basicshapes(double s,double b,double h){
        this.side=s;
        this.base=b;
        this.height=h;
    } 
    Basicshapes(double l,double w){
        this.length=l;
        this.width=w;
    }
    Basicshapes(double r){
        this.radius=r;
    }
    double perimeter(int t){
    	double p;
    	switch(t) {
    	case 1:
          p= side+base+height;
          break;
    	case 2:
    	  p= 2*(length+width);
    	  break;
    	case 3:
    	  p= 2*3.14*radius;
    	  break;
    	default:
    	  p= 0;
    	  break;		
    }
    	return p;
    }
    double area(int t){
    	double a;
    	switch(t) {
    	case 1:
    	  a= 0.5*base*height;
          break;
    	case 2:
    	  a= length*width;
    	  break;
    	case 3:
    	  a= 3.14*radius*radius;
    	  break;
    	default:
    	  a= 0;
    	  break;		
    }
    	return a;
    }
}
public class Shapes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        l.log(Level.INFO,()->"Please enter the choice you want : \n \t 1. Triangle \n \t 2. Rectangle \n \t 3. Circle");
        int n = s.nextInt();
        double p;
        double a;
        switch(n){
            case 1:
            Basicshapes t = new Basicshapes(4.5,7.8,7);
            p=t.perimeter(n);
            a=t.area(n);
            l.log(Level.INFO,()->"Perimeter of Triangle "+p);
            l.log(Level.INFO,()->"Area of Triangle "+a);
            break;
            case 2:
            Basicshapes r = new Basicshapes(4.5,9);
            p=r.perimeter(n);
            a=r.area(n);
            l.log(Level.INFO,()->"Perimeter of Rectangle "+p);
            l.log(Level.INFO,()->"Area of Rectangle "+a);
            break;
            case 3:
            Basicshapes c = new Basicshapes(5.4);
            p=c.perimeter(n);
            a=c.area(n);
            l.log(Level.INFO,()->"Perimeter of Circle "+p);
            l.log(Level.INFO,()->"Area of Circle "+a);
            break;
            default:
            l.log(Level.INFO,()->"Please Enter the choice between the range 1 to 3");
            break;
        }
}
}

