import java.util.*;

public class T1Question3 {
    public static void main(String[] args){
		Scanner key = new Scanner(System.in);
        Point p = new Point();
        Circle c = new Circle();

        System.out.print("1. Enter Value of x : ");
        p.setCoorX(key.nextDouble());

        System.out.print("2. Enter Value of y : ");
        p.setCoorY(key.nextDouble());

        System.out.print("3. Enter The Value Circle of x : ");
        c.centre.setCoorX(key.nextDouble());

        System.out.print("4. Enter The Value Circle of y : ");
        c.centre.setCoorY(key.nextDouble());

        System.out.print("5. Enter Value of Radius : ");
        c.setRadius(key.nextDouble());

        double coorX = p.getCoorX() - c.centre.getCoorX();
        double coorY = p.getCoorY() - c.centre.getCoorY();
        double res = Math.sqrt(Math.pow(coorX,2)+ Math.pow(coorY ,2));

        if(res==coorX.getRadius()){//Error double cannot be dereferenced
            System.out.println("Circle is on point");
        }
        else if(res<coorX.getRadius()){//Error double cannot be dereferenced
            System.out.println("Circle is inside the point");
        }
        else{
            System.out.println("Circle is outside the point");
        }
    }
}
